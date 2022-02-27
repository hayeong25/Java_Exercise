package Chapter11_Graphic_Test;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;

public class Chapter11_006 extends JFrame {
	public Chapter11_006() {
		setTitle("+ - 키로 이미지 확대 축소");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_006();
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, this);
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					char c = e.getKeyChar();
					
					switch(c) {
					case '+' :
						g.drawImage(img, 10, 10, img.getWidth()*1.1, img.getHeight()*1.1, this);
					case '-' :
						g.drawImage(img, 10, 10, img.getWidth()*0.9, img.getHeight()*0.9, this);
					}
					repaint();
				}
			});
		}		
	}
}