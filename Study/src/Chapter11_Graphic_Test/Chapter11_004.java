package Chapter11_Graphic_Test;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Chapter11_004 extends JFrame {
	public Chapter11_004() {
		setTitle("이미지 위에 원 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_004();
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					g.setColor(Color.GREEN);
					g.fillOval(e.getX(), e.getY(), 20, 20);
					repaint();
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					g.setColor(Color.GREEN);
					g.fillOval(e.getX(), e.getY(), 20, 20);
				}
			});
		}
	}
}