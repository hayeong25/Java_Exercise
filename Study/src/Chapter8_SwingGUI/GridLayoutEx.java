package Chapter8_SwingGUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(1, 10)); // 1 x 10의 GridLayout 배치 관리자
		
		for (int i = 0; i < 10; i++) {
			String text = Integer.toString(i); // 정수 i를 문자열로 변환
			JButton button = new JButton(text); // Button 컴포넌트 생성
			contentPane.add(button);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}