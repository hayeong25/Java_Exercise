package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_OpenChallenge_GamePanel extends JFrame {
	
	public Chapter9_OpenChallenge_GamePanel() {
		setTitle("Open Challenge9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		
		int n = (int)(Math.random() * 5);
		JLabel one = new JLabel(Integer.toString(n));
		JLabel two = new JLabel(Integer.toString(n));
		JLabel three = new JLabel(Integer.toString(n));
		
		
		
		String message = "시작합니다.";
		JLabel ment = new JLabel(message);
		
		while(true) {
			if(one.equals(two) && two.equals(three)) {
				message = "축하합니다!!";
			}
			else {
				message = "아쉽군요.";
			}
			
			
		}
		
	}
	
	class GameKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {
				
			}
		}
	}
	
	public static void main(String[] args) {
		new Chapter9_OpenChallenge_GamePanel();
	}
}