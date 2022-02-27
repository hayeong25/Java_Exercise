package Chapter14_ServerClient_Test_;

import java.io.*;
import java.util.*;
import java.net.*;

public class Chapter14_003_Client {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("스펠링 체크 클라이언트입니다.");
			socket = new Socket("localhost", 9999);
			System.out.println("스펠링 체크 서버에 접속했습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("단어 >> ");
				String outputMesssage = scanner.next();
				
				if(outputMesssage.equalsIgnoreCase("그만")) {
					out.write(outputMesssage + "\n");
					out.flush();
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				
				out.write(outputMesssage +"\n");
				out.flush();
				String inputMessage = in.readLine();
				char res = inputMessage.charAt((inputMessage.length()) -1);
				switch(res) {
				case 'O' :
					System.out.println("NO");
					break;
				case 'S' :
					System.out.println("YES");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				System.out.println("서버와 통신 중 오류가 발생했습니다.");
			}
		}
	}
}