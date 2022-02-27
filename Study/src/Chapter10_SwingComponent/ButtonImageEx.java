package Chapter10_SwingComponent;

import java.awt.*;
import javax.swing.*;

public class ButtonImageEx extends JFrame {
	public ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 3개의 이미지를 읽어들인다
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); // normalIcon 아이콘
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif"); // rolloverIcon 아이콘
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif"); // pressedIcon 아이콘
		
		// 3개의 아이콘을 가진 버튼 컴포넌트 생성
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonImageEx();
	}
}