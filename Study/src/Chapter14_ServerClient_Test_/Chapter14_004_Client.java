package Chapter14_ServerClient_Test_;

import java.io.*;
import java.util.*;
import java.net.*;

public class Chapter14_004_Client {	
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
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		String outputMessage = "";
		
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			System.out.println("끝말잇기 클라이언트입니다.");
			socket = new Socket("localhost", 9999);
			System.out.println("끝말잇기 게임 서버에 접속하였습니다.");
			
			while(true) {
				String inputMessage = in.readLine();
				System.out.println("서버 >> " + inputMessage);
				if(!Chapter14_004_Client.vcheck(inputMessage) || !Chapter14_004_Client.check(outputMessage, inputMessage)) {
					System.out.println("클라이언트가 이겼습니다.");
					break;
				}
				
				System.out.print("클라이언트 >> ");
				outputMessage = scanner.next();
				if(outputMessage.equalsIgnoreCase("그만")) {
					System.out.println("끝말잇기를 종료합니다.");
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				
				if(!Chapter14_004_Client.vcheck(outputMessage) || !Chapter14_004_Client.check(inputMessage, outputMessage)) {
					System.out.println("클라이언트가 졌습니다.");
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
			} catch (IOException e) {
				System.out.println("서버와 통신 중 오류가 발생했습니다.");
			}
		}
	}
}