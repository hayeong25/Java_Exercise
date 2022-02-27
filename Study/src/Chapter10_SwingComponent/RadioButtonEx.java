package Chapter10_SwingComponent;

import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup(); // 버튼 그룹 객체 생성
		
		// 라디오 버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true); // 3개 중 두 번째 라디오 버튼이 선택 상태
		JRadioButton cherry = new JRadioButton("체리");
		
		// 버튼 그룹에 3개의 라디오 버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// ContentPane에 3개의 라디오 버튼 삽입. 라디오 버튼이 ContentPane에 삽입되어야 화면에 출력된다
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}