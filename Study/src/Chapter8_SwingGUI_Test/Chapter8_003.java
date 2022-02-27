package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_003 extends JFrame {
	
	public Chapter8_003() {
		super("FlowLayout Practice");
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		
		JLabel one = new JLabel("100 + 200");
		JLabel two = new JLabel("300");
		
		JButton equals = new JButton("=");
		
		contentPane.add(one);
		contentPane.add(equals);
		contentPane.add(two);
		
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_003();
	}
}