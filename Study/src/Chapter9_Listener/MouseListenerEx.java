package Chapter9_Listener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	
	private JLabel la = new JLabel("Hello"); // "Hello" 문자열을 출력하기 위한 레이블
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); // contentPane에 이벤트 리스너 달기
		
		c.setLayout(null); // contentPane의 배치 관리자 삭제
		la.setSize(50, 20); // 레이블 크기 50x20
		la.setLocation(30, 30); // 레이블 위치 (30, 30)
		c.add(la);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	// MouseListener 구현
	class MyMouseListener implements MouseListener { // MouseListener의 5개 메소드 모두 구현

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) { // 마우스 버튼이 눌러진 (x, y) 위치를 알아냄
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 y
			la.setLocation(x, y); // 레이블의 위치를 (x, y)로 이동
		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}