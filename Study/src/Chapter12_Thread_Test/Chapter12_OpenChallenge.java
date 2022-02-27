package Chapter12_Thread_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12_OpenChallenge extends JFrame {
	
	public Chapter12_OpenChallenge() {
		setTitle("Open Challenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container GamePanel = getContentPane();
		GamePanel.setLayout(null);
		
		JLabel m = new JLabel("M");
		m.setForeground(Color.BLACK);
		m.setBounds((int)(Math.random() * GamePanel.getWidth()), (int)(Math.random() * GamePanel.getHeight()), 15, 15);
		JLabel a = new JLabel("@");
		a.setForeground(Color.RED);
		a.setBounds((int)(Math.random() * GamePanel.getWidth()), (int)(Math.random() * GamePanel.getHeight()), 15, 15);
		
		a.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'q') {
					System.exit(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					a.setLocation(a.getX(), a.getY() - 10);
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					a.setLocation(a.getX(), a.getY() + 10);
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					a.setLocation(a.getX() - 10, a.getY());
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					a.setLocation(a.getX() + 10, a.getY());
				}
			}
		});
		
		GamePanel.add(m);
		GamePanel.add(a);
		
		setSize(300, 300);
		setVisible(true);
		GamePanel.setFocusable(true);
		GamePanel.requestFocus();
		
		MonsterThread th = new MonsterThread(m, a);
		th.start();
	}
	
	public static void main(String[] args) {
		new Chapter12_OpenChallenge();
	}
}

class MonsterThread extends Thread {
	private JLabel m;
	private JLabel a;
	
	public MonsterThread(JLabel m, JLabel a) {
		this.m = m;
		this.a = a;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(200);
				
				if(a.getX() < m.getX()) {
					m.setLocation(m.getX() - 5, m.getY());
				}
				if(a.getX() > m.getX()) {
					m.setLocation(m.getX() + 5, m.getY());
				}
				if(a.getY() < m.getY()) {
					m.setLocation(m.getX(), m.getY() - 5);
				}
				if(a.getY() > m.getY()) {
					m.setLocation(m.getX(), m.getY() + 5);
				}
				m.getParent().repaint();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}