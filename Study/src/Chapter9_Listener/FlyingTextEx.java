package Chapter9_Listener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
	private JLabel la = new JLabel("HELLO");// 키 입력에 따라 움직일 레이블 컴포넌트
	
	public FlyingTextEx() {
		super("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // "HELLO" 레이블을 contentPan상의 임의의 위치로 마음대로 움직이기 위해 배치관리자 삭제
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50); // 레이블의 초기 위치는 (50, 50)
		la.setSize(100, 20);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true); // contentPane이 포커스를 받을 수 있도록 설정
		c.requestFocus(); // contentPane이 키 입력을 받을 수 있도록 포커스 강제 지정
	}
	
	// KeyListener 구현
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 입력된 키의 키 코드를 알아낸다
			
			switch(keyCode) {
			case KeyEvent.VK_UP : // UP 키
				la.setLocation(la.getX(), la.getY() - 10); // <UP> 키인 경우, la의 현재 위치에서 10픽셀만큼 위로 이동
				break;
			case KeyEvent.VK_DOWN : // DOWN 키
				la.setLocation(la.getX(), la.getY() + 10);
				break;
			case KeyEvent.VK_LEFT : // LEFT 키
				la.setLocation(la.getX() - 10, la.getY());
				break;
			case KeyEvent.VK_RIGHT : // RIGHT 키
				la.setLocation(la.getX() + 10, la.getY());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}