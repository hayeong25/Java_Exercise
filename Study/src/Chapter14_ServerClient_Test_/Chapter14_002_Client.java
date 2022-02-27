package Chapter14_ServerClient_Test_;

import java.io.*;
import java.net.*;
import java.util.*;

public class Chapter14_002_Client {
	public static void main(String[] args) {
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9990);
			System.out.println("서버에 접속했습니다.");
			
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("보낼 정수 입력 >> ");
				String outputMessage = scanner.next();
				
				if(Integer.parseInt(outputMessage) < 0) {
					out.write(outputMessage + "\n");
					out.flush();
					System.out.println("연결을 종료합니다.");
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
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				System.out.println("서버와 통신 중 오류가 발생했습니다.");
			}
		}
	}
}
