package Chapter10_SwingComponent;

import java.awt.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 3개의 체크박스 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true); // 선택 상태의 체크박스
		JCheckBox cherry = new JCheckBox("체리");
		
		// ContentPane에 3개의 체크박스 삽입
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}