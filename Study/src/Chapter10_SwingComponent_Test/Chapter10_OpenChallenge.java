package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_OpenChallenge extends JFrame {
	private ImageIcon[] images = {new ImageIcon("src/images/ico01.jpg"), new ImageIcon("src/images/ico02.jpg"), new ImageIcon("src/images/ico03.jpg"), new ImageIcon("src/images/ico04.jpg")};
	private int count = 0;
	
	public Chapter10_OpenChallenge() {
		super("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel pa1 = new JPanel();
		JPanel pa2 = new JPanel();
		pa2.setBackground(Color.GRAY);
		c.add(pa1, BorderLayout.CENTER);
		c.add(pa2, BorderLayout.SOUTH);
		
		JLabel imgLabel = new JLabel();
		pa1.add(imgLabel);
		
		JButton left = new JButton("←");
		JButton right = new JButton("→");
		pa2.add(left);
		pa2.add(right);
		
		imgLabel.setIcon(images[count]);
		
		left.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(count > 0) {
					count--;
					imgLabel.setIcon(images[count]);
				}
			}
		});
		
		right.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(count < 4) {
					count++;
					imgLabel.setIcon(images[count]);
				}
			}
		});
		
		setSize(200, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter10_OpenChallenge();
	}
}