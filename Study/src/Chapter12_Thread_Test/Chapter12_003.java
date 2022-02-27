package Chapter12_Thread_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter12_003 extends JFrame {
	public Chapter12_003() {
		setTitle("Walking Label");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel WalkingLabel = new JLabel();
		String text = "나는 당신을 사랑합니다";
		
		c.add(WalkingLabel);
		setSize(300, 200);
		setVisible(true);
		
		setFocusable(true);
		requestFocus();
		
		MyThread th = new MyThread(WalkingLabel, text);
		th.start();
	}
	
	class MyThread extends Thread {
		private JLabel WalkingLabel;
		private String text;
		
		public MyThread(JLabel WalkingLabel, String text) {
			this.WalkingLabel = WalkingLabel;
			this.text = text;
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					sleep(500);
				} catch (InterruptedException e) {
					return;
				}
				
				for (int i = 0; i < text.length(); i++) {
					WalkingLabel.setText(WalkingLabel.getText() + text.charAt(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Chapter12_003();
	}
}