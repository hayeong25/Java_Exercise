package Chapter12_Thread;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; // 타이머 값이 출력된 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; // 초 카운트를 출력할 레이블
	}
	
	// Thread 코드. run()이 종료되면 Thread 종료
	@Override
	public void run() {
		int n = 0; // 타이머 카운트 값
		while(true) {
			timerLabel.setText(Integer.toString(n)); // 레이블에 카운트 값 출력
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return; // 예외가 발생하면 run() 메소드 종료. Thread 종료
			}
		}
	}
}

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); // 레이블을 ContentPane에 부착
		
		// 타이머 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable); // Thread 객체 생성
		
		setSize(250, 150);
		setVisible(true);
		
		th.start(); // 타이머 스레드 실행 시작. TimerRunnable의 run() 메소드 실행
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
