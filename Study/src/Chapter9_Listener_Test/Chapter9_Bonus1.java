package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_Bonus1 extends JFrame {
	public Chapter9_Bonus1() {
		super("마우스 휠로 확대 축소");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		c.addMouseWheelListener(new MouseWheelListener() {
			Font f = la.getFont();
			int size = f.getSize();
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) { // n이 음수이면 축소
					if(size > 5) {
						la.setFont(new Font("Arial", Font.PLAIN, size - 5));
						size -= 5;
					}
				}
				if(n > 0) { // n이 양수이면 확대
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
					size += 5;
				}
			}
		});
		
		c.add(la);
		
		setSize(400, 400);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter9_Bonus1();
	}
}