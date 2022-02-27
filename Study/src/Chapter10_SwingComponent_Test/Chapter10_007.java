package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_007 extends JFrame {
	public Chapter10_007() {
		super("이미지 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel image = new JLabel(new ImageIcon("src/images/ico01.jpg"));
		image.setBounds(150, 150, 50, 50);
		
		image.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				image.setLocation(x, y);
			}
		});
		
		c.add(image);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_007();
	}
}