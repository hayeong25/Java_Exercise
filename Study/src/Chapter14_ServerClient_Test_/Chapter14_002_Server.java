package Chapter14_ServerClient_Test_;

import java.io.*;
import java.net.*;

public class Chapter14_002_Server {
	public static void main(String[] args) {
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		try {
			listener = new ServerSocket(9990);
			System.out.println("서버입니다. 클라이언트를 기다립니다.");
			
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			int sum = 0;
			while(true) {
				String inputMessage = in.readLine();
				
				if(Integer.parseInt(inputMessage) < 0) {
					System.out.println("서버를 종료합니다.");
					break;
				}
				
				sum += Integer.parseInt(inputMessage);
				System.out.println("누적합 " + sum);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}