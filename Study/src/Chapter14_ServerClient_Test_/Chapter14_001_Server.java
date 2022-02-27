package Chapter14_ServerClient_Test_;

import java.io.*;
import java.net.*;

public class Chapter14_001_Server {
	public static void main(String[] args) {
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버입니다. 클라이언트를 기다립니다...");
			
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("끝")) {
					System.out.println("서버를 종료합니다.");
					break;
				}
				System.out.println("... " + inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				listener.close();
				socket.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}