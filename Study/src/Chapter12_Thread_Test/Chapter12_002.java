package Chapter12_Thread_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter12_002 extends JFrame {
	public Chapter12_002() {
		setTitle("원이 0.5초마다 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
		setFocusable(true);
		requestFocus();
		
		MyThread th = new MyThread();
		th.start();
	}
	
	private class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.MAGENTA);
			g.drawOval((int)(Math.random() * this.getWidth()), (int)(Math.random() * this.getHeight()), 50, 50);
		}
	}
	
	private class MyThread extends Thread {
		@Override
		public void run() {
			while(true) {
				try {
					sleep(500);
				} catch (InterruptedException e) {
					return;
				}
				
				repaint();
			}
		}
	}
	
	public static void main(String[] args) {
		new Chapter12_002();
	}
}