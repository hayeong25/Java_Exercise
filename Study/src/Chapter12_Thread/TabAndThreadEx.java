package Chapter12_Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyLabel extends JLabel {
	private int barSize = 0; // bar의 크기
	private int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)((double)(getWidth()) / maxBarSize * barSize);
		if(width ==0) {
			return; // 크기가 0이기 때문에 bar를 그릴 필요가 없음
		}
		g.fillRect(0, 0, width, this.getHeight()); // width만큼 MAGENTA 색으로 칠함
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait(); // bar의 크기가 최대이면, ConsumerThread에 의해 바의 크기가 줄어들 때까지 대기
			} catch (InterruptedException e) {
				return;
			}
		}
		
		barSize++;
		repaint(); // bar 다시 그리기
		notify(); // 기다리는 ConsumerThread 깨우기
	}
	
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait(); // bar의 크기가 0이면 bar의 크기가 0보다 커질 때까지 대기
			} catch (InterruptedException e) {
				return;
			}
		}
		
		barSize--;
		repaint(); // bar 다시 그리기
		notify(); // 기다리는 키 이벤트 리스너(Thread) 깨우기
	}
}

class ConsumerThread extends Thread {
	private MyLabel bar;
	
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(100); // 0.1초 잠을 잠
				bar.consume(); // 0.1초마다 바를 1씩 줄임
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame {
	private MyLabel bar = new MyLabel(100); // 바의 최대 크기를 100으로 설정
	
	public TabAndThreadEx(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20); // 300x20 크기의 바
		
		c.add(bar);
		
		// ContentPane에 키 이벤트 핸들러 등록
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill(); // 키를 누를 때마다 바가 1씩 증가
			}
		});
		
		setSize(350, 200);
		setVisible(true);
		
		c.setFocusable(true); // ContentPane이 포커스를 받을 수 있도록 설정
		c.requestFocus(); // ContentPane에게 키 입력 독점권 부여
		ConsumerThread th = new ConsumerThread(bar); // Thread 생성
		th.start(); // Thread 시작
	}
	
	public static void main(String[] args) {
		new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");
	}
}