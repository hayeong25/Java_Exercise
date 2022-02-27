package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_006 extends JFrame {
	public Chapter9_006() {
		super("3x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 3));
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.BLACK};
		
		for (int i = 0; i < 12; i++) {
			JLabel la = new JLabel(Integer.toString(i));
			la.setBackground(Color.WHITE);
			
			la.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int random = (int)(Math.random() * 12);
					la.setBackground(color[random]);
					la.setOpaque(true);
				}
			});
			
			c.add(la);
		}
		
		setSize(400, 400);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter9_006();
	}
}