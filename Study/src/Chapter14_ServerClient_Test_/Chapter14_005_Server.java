package Chapter14_ServerClient_Test_;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class Chapter14_005_Server extends JFrame{
	private JLabel java = new JLabel("JAVA");
	private BufferedReader in = null;
	private Socket socket = null;
	private String inputMessage = "";
	
	public Chapter14_005_Server() {
		setTitle("원격 서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		
		java.setFont(new Font("Arial", Font.BOLD, 12));
		java.setEnabled(false);
		MySocket ms = new MySocket();
		ms.main();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MySocket {
		void main() {
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("CONNECT")) {
					socket = new Socket("localhost", 9999);
					java.setEnabled(true);
					java.setForeground(Color.MAGENTA);
					MyListener li = new MyListener();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					socket.close();
				} catch (Exception e) {
					System.out.println("클라이언트와 통신 중 오류가 발생했습니다.");
				}
			}
		}
	}
	
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				JLabel j = (JLabel)e.getSource();
				switch(in.readLine()) {
				case "UP" :
					j.setLocation(j.getX(), j.getY() - 5);
					break;
				case "DOWN" :
					j.setLocation(j.getX(), j.getY() + 5);
					break;
				case "LEFT" :
					j.setLocation(j.getX() - 5, j.getY());
					break;
				case "RIGHT" :
					j.setLocation(j.getX() + 5, j.getY());
					break;
				}
			} catch (Exception e2) {
				
			}
		}		
	}
	
	public static void main(String[] args) {
		new Chapter14_005_Server();
	}
}