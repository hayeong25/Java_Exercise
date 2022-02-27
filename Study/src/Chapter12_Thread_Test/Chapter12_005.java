package Chapter12_Thread_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12_005 extends JFrame {
	public Chapter12_005() {
		setTitle("사격 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel chicken = new JLabel(new ImageIcon("src/images/ico01.jpg"));
		JLabel gun = new JLabel();
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter12_005();
	}
}