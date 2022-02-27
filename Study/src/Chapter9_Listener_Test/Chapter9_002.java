package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_002 extends JFrame {
	public Chapter9_002() {
		super("r키 누르기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		contentPane.setBackground(Color.CYAN);
		
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'r') {
					contentPane.setBackground(Color.RED);
				}
				else {
					contentPane.setBackground(Color.CYAN);
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				contentPane.setBackground(Color.CYAN);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter9_002();
	}
}