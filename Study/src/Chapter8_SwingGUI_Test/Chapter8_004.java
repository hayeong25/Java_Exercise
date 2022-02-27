package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_004 extends JFrame {
	
	public Chapter8_004() {
		super("Ten Color Buttons Frame");
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout());
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
		
		for (int i = 0; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true); // 배경색이 보이게 설정
			button.setBackground(color[i]); // 각 버튼의 색 설정
			contentPane.add(button); // contentPane에 버튼 부착
		}
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_004();
	}
}