package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_005 extends JFrame {
	public Chapter8_005() {
		super("4x4 Color Frame");
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(4, 4));
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
		
		for (int i = 0; i < color.length; i++) {
				JLabel la = new JLabel(Integer.toString(i));
				la.setOpaque(true);
				la.setBackground(color[i]);
				contentPane.add(la);
		}
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_005();
	}
}