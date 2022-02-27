package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_006 extends JFrame {
	public Chapter8_006() {
		super("Random Lables");
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		for (int i = 0; i < 20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			
			int x = (int)(Math.random() * 220) + 30; // 30 ~ 250 사이의 랜덤
			int y = (int)(Math.random() * 220) + 30;
			
			label.setLocation(x, y);
			
			label.setSize(20, 20);
			label.setForeground(Color.MAGENTA); // 글자색
			
			contentPane.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_006();
	}
}