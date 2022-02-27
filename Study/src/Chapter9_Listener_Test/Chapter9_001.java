package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_001 extends JFrame {
	public Chapter9_001() {
		setTitle("마우스 올리면 사랑해");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("사랑해");
		
		la.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				la.setText("자기야");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				la.setText("사랑해");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		contentPane.add(la, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter9_001();
	}
}