package Chapter8_SwingGUI_Test;

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel { // NORTH에 붙일 패널
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
	}
}

class CenterPanel extends JPanel { // CENTER에 붙일 패널
	public CenterPanel() {
		
	}
}

public class Chapter8_OpenChallenge extends JFrame {
	public Chapter8_OpenChallenge() {
		setTitle("Opne Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		NorthPanel n = new NorthPanel();
		CenterPanel c = new CenterPanel();
		
		n.add(new JButton("Open"));
		n.add(new JButton("Read"));
		n.add(new JButton("Close"));
		
		JLabel j = new JLabel("Hello Java!");
		j.setSize(100, 20);
		j.setLocation(100, 50);
		c.add(j);
		
		contentPane.add(n, BorderLayout.NORTH);
		contentPane.add(c, BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter8_OpenChallenge();
	}
}