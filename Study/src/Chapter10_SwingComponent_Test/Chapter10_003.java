package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_003 extends JFrame {
	public Chapter10_003() {
		super("Two Radio Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.RED);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton red = new JRadioButton("Red", true);
		JRadioButton blue = new JRadioButton("Blue");
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.RED);
			}
		});
		
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.BLUE);
			}
		});
		
		group.add(red);
		group.add(blue);
		
		c.add(red);
		c.add(blue);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_003();
	}
}