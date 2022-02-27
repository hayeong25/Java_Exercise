package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_006 extends JFrame {
	public Chapter10_006() {
		super("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf1 = new JTextField(8);
		JTextField tf2 = new JTextField(8);
		JLabel la = new JLabel("->");
		
		c.add(tf1);
		c.add(la);
		c.add(tf2);
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton decimal = new JRadioButton("decimal");
		JRadioButton binary = new JRadioButton("binary");
		JRadioButton octal = new JRadioButton("octal");
		JRadioButton hex = new JRadioButton("hex");
		
		group.add(decimal);
		group.add(binary);
		group.add(octal);
		group.add(hex);
		
		decimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(tf1.getText());
				tf2.setText(Integer.toString(n));
			}
		});
		
		binary.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(tf1.getText());
				tf2.setText(Integer.toBinaryString(n));
			}
		});
		
		octal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(tf1.getText());
				tf2.setText(Integer.toOctalString(n));
			}
		});
		
		hex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(tf1.getText());
				tf2.setText(Integer.toHexString(n));
			}
		});
		
		c.add(decimal);
		c.add(binary);
		c.add(octal);
		c.add(hex);
		
		setSize(280, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_006();
	}
}