package Chapter8_SwingGUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); // conttentPane 알아내기
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 왼쪽 정렬, 수평 간격 30픽셀, 수직 간격 40픽셀
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300, 200); // 프레임 크기 300 x 200
		setVisible(true); // 화면에 프레임 출력
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}