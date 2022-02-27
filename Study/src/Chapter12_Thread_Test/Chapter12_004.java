package Chapter12_Thread_Test;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Chapter12_004 extends JFrame {
	public Chapter12_004() {
		setTitle("디지털 시계");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setFont(new Font("Gothic", Font.BOLD, 30));
		label.setLocation(this.getWidth() / 2, this.getHeight() / 2);
		this.add(label);
		
		setSize(300, 200);
		setVisible(true);
		
		setFocusable(true);
		requestFocus();
		
		MyThread th = new MyThread(label);
		th.start();
	}
	
	class MyThread extends Thread {
		private JLabel label;
		
		public MyThread(JLabel label) {
			this.label = label;
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					Calendar c = Calendar.getInstance(); // 현재년도, 날짜, 시간 값을 가진 객체 얻기
					int hour = c.get(Calendar.HOUR_OF_DAY);
					int min = c.get(Calendar.MINUTE);
					int second = c.get(Calendar.SECOND);
					
					String clockText = Integer.toString(hour);
					clockText = clockText.concat(" : ");
					clockText = clockText.concat(Integer.toString(min));
					clockText = clockText.concat(" : ");
					clockText = clockText.concat(Integer.toString(second));
					
					label.setText(clockText);
				} catch (Exception e) {
					return;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Chapter12_004();
	}
}