package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_002 extends JFrame {

	public Chapter8_002() {
		super("BorderLayout Practice");
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(50, 5));
		
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton center = new JButton("Center");
		
		contentPane.add(north, BorderLayout.NORTH);
		contentPane.add(south, BorderLayout.SOUTH);
		contentPane.add(east, BorderLayout.EAST);
		contentPane.add(west, BorderLayout.WEST);
		contentPane.add(center, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_002();
	}
}