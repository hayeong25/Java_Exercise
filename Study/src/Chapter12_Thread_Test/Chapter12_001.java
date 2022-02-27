package Chapter12_Thread_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter12_001 extends JFrame {
	public Chapter12_001() {
		setTitle("실행 시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.YELLOW);
		
		setSize(300, 200);
		setVisible(true);
		
		MyThread th = new MyThread();
		th.start();
	}
	
	private class MyThread extends Thread {		
		@Override
		public void run() {
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				return;
			}
			
			setTitle("실행 종료");
			getContentPane().setBackground(Color.BLUE);
		}
	}
	
	public static void main(String[] args) {
		new Chapter12_001();
	}
}