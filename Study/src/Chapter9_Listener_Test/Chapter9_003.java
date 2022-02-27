package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_003 extends JFrame {
	public Chapter9_003() {
		super("드래깅 동안만 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setBackground(Color.GREEN);
		
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter9_003();
	}
}