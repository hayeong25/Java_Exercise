package Chapter12_Thread_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12_006 extends JFrame {
	public Chapter12_006() {
		setTitle("버블 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 300);
		setVisible(true);
		
		setFocusable(true);
		requestFocus();
		MyThread th = new MyThread();
		th.start();
	}
	
	public static void main(String[] args) {
		new Chapter12_006();
	}
	
	class MyThread extends Thread {
		@Override
		public void run() {
			try {
				sleep(20);
			} catch (Exception e) {
				return;
			}
		}
	}
}