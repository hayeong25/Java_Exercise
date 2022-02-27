package Chapter14_ServerClient_Test_;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class Chapter14_005_Client extends JFrame {
	private JButton up = new JButton("UP");
	private JButton down = new JButton("DOWN");
	private JButton left = new JButton("LEFT");
	private JButton right = new JButton("RIGHT");
	private JButton connect = new JButton("CONNECT");
	
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private String outputMessage = "";
	
	public Chapter14_005_Client() {
		setTitle("원격 제어 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(up, BorderLayout.NORTH);
		c.add(down, BorderLayout.SOUTH);
		c.add(left, BorderLayout.WEST);
		c.add(right, BorderLayout.EAST);
		c.add(connect, BorderLayout.CENTER);
		
		up.setEnabled(false);
		down.setEnabled(false);
		left.setEnabled(false);
		right.setEnabled(false);
		connect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MySocket ms = new MySocket();
				ms.main();
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MySocket {
		void main() {
			try {
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				listener = new ServerSocket(9999);
				socket = listener.accept();
				getContentPane().setName("연결됨");
				out.write("CONNECT" + "\n");
				connect.setEnabled(false);
				up.setEnabled(true);
				down.setEnabled(true);
				left.setEnabled(true);
				right.setEnabled(true);
				
				while(true) {
					MyListener li = new MyListener();
					out.write(outputMessage + "\n");
					out.flush();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					socket.close();
					listener.close();
				} catch (Exception e) {
					System.out.println("서버와 통신 중 오류가 발생했습니다.");
				}
			}
		}
	}
	
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton j = (JButton)e.getSource();
			if(j.getText() == "UP") {
				outputMessage = "UP";
			}
			if(j.getText() == "DOWN") {
				outputMessage = "DOWN";
			}
			if(j.getText() == "LEFT") {
				outputMessage = "LEFT";
			}
			if(j.getText() == "RIGHT") {
				outputMessage = "RIGHT";
			}
		}
	}
	
	public static void main(String[] args) {
		new Chapter14_005_Client();
	}
}