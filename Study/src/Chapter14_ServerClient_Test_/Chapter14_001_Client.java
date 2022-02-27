package Chapter14_ServerClient_Test_;

import java.io.*;
import java.net.*;
import java.util.*;

public class Chapter14_001_Client {
	public static void main(String[] args) {
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999);
			System.out.println("서버에 접속했습니다.");
			
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("텍스트 입력 >> ");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("끝")) {
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
				System.out.println("서버에 채팅을 전송하는 중 오류가 발생했습니다.");
			}
		}
	}
}