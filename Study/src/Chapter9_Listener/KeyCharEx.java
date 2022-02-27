package Chapter9_Listener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다.");
	
	public KeyCharEx() {
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener()); // KeyListener 달기
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true); // contentPane이 포커스를 받을 수 있도록 설정
		c.requestFocus(); // contentPane에 포커스를 주어 키 입력을 받을 수 있게 함
		// 둘 다 있어야 contentPane이 키 입력을 받을 수 있다.
		// setVisible(true); 실행 후에 실행되어야 한다. setVisible(true)는 프레임 출력한 후에 임의의 컴포넌트에 포커스를 주기 때문
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// 임의의 색을 만들기 위해 랜덤하게 r, g, b 성분 생성
			int r = (int)(Math.random() * 256); // 0 ~ 255 사이의 임의의 red 성분
			int g = (int)(Math.random() * 256); // 0 ~ 255 사이의 임의의 green 성분
			int b = (int)(Math.random() * 256); // 0 ~ 255 사이의 임의의 blue 성분
			
			switch(e.getKeyChar()) { // 입력된 키 문자
			case '\n' : // <Enter> 키 입력
				la.setText("r = " + r + ", g = " + g + ", b = " + b);
				getContentPane().setBackground(new Color(r, g, b)); // contentPane의 배경색 설정
				break;
			case 'q' :
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new KeyCharEx();
	}
}