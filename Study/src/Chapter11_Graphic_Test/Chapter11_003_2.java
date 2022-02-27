package Chapter11_Graphic_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter11_003_2 extends JFrame {
	public Chapter11_003_2() {
		setTitle("아래로 나란히 출력하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_003_2();
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon1 = new ImageIcon("images/a.jpg");
		private ImageIcon icon2 = new ImageIcon("images/b.jpg");
		private Image img1 = icon1.getImage();
		private Image img2 = icon2.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img1, 0, this.getHeight(), this.getWidth(), this.getHeight() / 2, this);
			g.drawImage(img2, 0, 0, this.getWidth(), this.getHeight() / 2, this);
		}
	}
}