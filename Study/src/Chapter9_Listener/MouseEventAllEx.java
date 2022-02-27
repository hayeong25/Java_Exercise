package Chapter9_Listener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx extends JFrame {
	private JLabel la = new JLabel("   Move me"); // 마우스로 이동시킬 레이블 컴포넌트
	
	public MouseEventAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		MyMouseListener listener = new MyMouseListener(); // 마우스/모션 리스너 객체 생성
		c.addMouseListener(listener); // MouseListener 등록
		c.addMouseMotionListener(listener); // MouseMotionListener 등록
		
		c.setLayout(null); // 배치관리자를 삭제해 레이블을 마음대로 움직일 수 있도록 함
		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la); // 레이블 컴포넌트 삽입
		
		setSize(320, 200);
		setVisible(true);
	}

	// MouseListener와 MouseMotionListener를 모두 가진 리스너 구현
	class MyMouseListener implements MouseListener, MouseMotionListener {

		// MouseMotionListener의 2개 메소드 모두 구현
		@Override
		public void mouseDragged(MouseEvent e) { // 마우스가 드래깅 되는 동안 계속 호출
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseDragged(" + e.getX() + ", " + e.getY() + ")"); // 드래깅 위치 출력
		}

		@Override
		public void mouseMoved(MouseEvent e) { // 마우스가 움직이는 동안 계속 호출
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseMoved(" + e.getX() + ", " + e.getY() + ")"); // 무브 위치 출력
		}

		// MouseListener의 5개 메소드 모두 구현
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // 마우스가 눌러진 위치로 레이블 이동
			setTitle("mousePressed(" + e.getX() + ", " + e.getY() + ")"); // 눌러진 위치 출력
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // 마우스가 놓여진 위치에 레이블 이동
			setTitle("mouseReleased(" + e.getX() + ", " + e.getY() + ")"); // 떼어진 위치 출력
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component comp = (Component)e.getSource();
			comp.setBackground(Color.CYAN); // 마우스가 올라간 곳 색 변경
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component comp = (Component)e.getSource();
			comp.setBackground(Color.YELLOW); // 마우스가 내려간 곳 색 변경
			setTitle("mouseExited(" + e.getX() + ", " + e.getY() + ")"); // 벗어난 위치 출력
		}
	}
	
	public static void main(String[] args) {
		new MouseEventAllEx();
	}
}