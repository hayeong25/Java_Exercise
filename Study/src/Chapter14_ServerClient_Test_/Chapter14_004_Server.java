package Chapter14_ServerClient_Test_;

import java.io.*;
import java.util.*;
import java.net.*;

public class Chapter14_004_Server {
	static boolean vcheck(String word) {
		Vector<String> v = new Vector<String>();
		FileReader fr = null;
		boolean b = false;
		
		try {
			fr = new FileReader("hangulwords.txt");
			
			int n;
			while((n = fr.read()) != -1) {
				v.add(Integer.toString(n));
			}
			
			for (int i = 0; i < v.size(); i++) {
				if(v.elementAt(i).equals(word)) {
					b = true;
				}
			}
		} catch (Exception e) {
			System.out.println("오류");
		}
		
		return b;
	}
	
	static boolean check(String word, String word2) {
		int lastIndex = word.length() - 1; // 마지막 문자에 대한 인덱스
		char lastChar = word.charAt(lastIndex); // 마지막 문자
		char firstChar = word2.charAt(0);
		
		boolean result = false;
		
		if(firstChar == lastChar) {
			result = true;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("끝말잇기 서버입니다.");
			
			File f = new File("hangulwords.txt");
			if(f.exists()) {
				System.out.println("hangulwords.txt 읽기 완료");
			}
			
			socket = listener.accept();
			System.out.println("클라이언트 연결됨");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			System.out.println("시작 단어는 농사일입니다.");
			String outputMessage = "농사일";
			System.out.println("서버 >> " + outputMessage);
			
			while(true) {
				String inputMessage = in.readLine();
				System.out.println("클라이언트 >> " + inputMessage);
				if(!Chapter14_004_Client.vcheck(inputMessage) || !Chapter14_004_Client.check(outputMessage, inputMessage)) {
					System.out.println("서버가 이겼습니다.");
					break;
				}
				
				System.out.print("서버 >> ");
				outputMessage = scanner.next();
								
				if(!Chapter14_004_Client.vcheck(outputMessage) || !Chapter14_004_Client.check(inputMessage, outputMessage)) {
					System.out.println("서버가 졌습니다.");
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 통신 중 오류가 발생했습니다.");
			}
		}
	}
}