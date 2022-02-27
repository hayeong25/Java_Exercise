package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_007 extends JFrame {
	public Chapter9_007() {
		super("0 만들기 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		while(true)	{	
			int number = (int)(Math.random() * 60) + 1;
			int count = 3;
			
			JLabel la = new JLabel(Integer.toString(number));
			c.add(la, BorderLayout.NORTH);
			
			JButton plus = new JButton("+2");
			JButton minus = new JButton("-1");
			JButton divide = new JButton("%4");
			c.add(plus, BorderLayout.SOUTH);
			c.add(minus, BorderLayout.SOUTH);
			c.add(divide, BorderLayout.SOUTH);
			
			c.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource() == "+2") {
						plus.setEnabled(false);
						number += 2;
						--count;
					}
					else if(e.getSource() == "-1") {
						minus.setEnabled(false);
						number -= 1;
						--count;
					}
					else if(e.getSource() == "%4") {
						divide.setEnabled(false);
						number %= 4;
						--count;
					}
				}
			});
			
			if(number == 0 || count == 0) {
				continue;
			}
			
			setSize(400, 300);
			setVisible(true);
			
			c.setFocusable(true);
			c.requestFocus();
		}
	}
	
	public static void main(String[] args) {
		new Chapter9_007();
	}
}