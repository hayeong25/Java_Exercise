package Chapter14_ServerClient_Test_;

import java.io.*;
import java.util.*;
import java.net.*;

public class Chapter14_003_Server {
	static String check(String word) {
		FileReader fr = null;
		Vector<String> v = new Vector<String>();
		String res = "";
		
		try {
			fr = new FileReader("c:\\Temp\\words.txt");
			int n;
			while((n = fr.read()) != -1) {
				v.add(Integer.toString(n));
			}
			
			for (int i = 0; i < v.size(); i++) {
				if(v.elementAt(i).equals(word)) {
					res = "YES";
				}
				else {
					res = "NO";
				}
			}
		} catch (Exception e) {
			System.out.println("단어 파일 오류");
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("스펠링 체크 서버입니다.");
			
			File f = new File("c:\\Temp\\words.txt");
			if(f.exists()) {
				System.out.println("words.txt 읽기 완료");
			}
			
			socket = listener.accept();
			System.out.println("클라이언트 연결됨");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				
				if(inputMessage.equalsIgnoreCase("그만")) {
					System.out.println("클라이언트 연결 종료");
					break;
				}
				
				String res = Chapter14_003_Server.check(inputMessage);
				System.out.println("요청단어 " + inputMessage + " = " + res);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 통신 중 오류가 발생했습니다.");
			}
		}
	}
}