package Chapter14_ServerClient_Test_;

import java.io.*;
import java.net.*;
import java.util.*;

public class Chapter14_OpenChallenge_Server {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			socket = listener.accept();
			System.out.println("클라이언트와 연결 완료");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String outputMessage = scanner.nextLine();
				if(socket == null) {
					break;
				}
				
				out.write(outputMessage +"\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("클라이언트 : " + inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}