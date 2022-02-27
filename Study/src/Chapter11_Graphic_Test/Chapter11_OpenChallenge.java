package Chapter11_Graphic_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter11_OpenChallenge extends JFrame {
	public Chapter11_OpenChallenge() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel pa1 = new JPanel();
		pa1.setBackground(Color.GRAY);
		JPanel pa2 = new JPanel();
		pa2.setBackground(Color.LIGHT_GRAY);
		JLabel la1 = new JLabel("apple");
		JLabel la2 = new JLabel("cherry");
		JLabel la3 = new JLabel("strawberry");
		JLabel la4 = new JLabel("prune");
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		JTextField tf3 = new JTextField(10);
		JTextField tf4 = new JTextField(10);
		
		pa1.add(la1); pa1.add(tf1);
		pa1.add(la2); pa1.add(tf2);
		pa1.add(la3); pa1.add(tf3);
		pa1.add(la4); pa1.add(tf4);
		
		JLabel la5 = new JLabel("apple 0%");
		la5.setForeground(Color.RED);
		JLabel la6 = new JLabel("cherry 0%");
		la6.setForeground(Color.BLUE);
		JLabel la7 = new JLabel("strawberry 0%");
		la7.setForeground(Color.MAGENTA);
		JLabel la8 = new JLabel("prune 0%");
		la8.setForeground(Color.ORANGE);
		
		pa2.add(la5); pa2.add(la6); pa2.add(la7); pa2.add(la8);
		
		
		
		c.add(pa1, BorderLayout.NORTH);
		c.add(pa2, BorderLayout.CENTER);
		
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_OpenChallenge();
	}
}