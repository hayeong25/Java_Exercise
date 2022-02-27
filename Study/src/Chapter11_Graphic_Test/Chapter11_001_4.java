package Chapter11_Graphic_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter11_001_4 extends JFrame {
	public Chapter11_001_4() {
		setTitle("컨텐트팬을 10x10으로 나누는 격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_001_4();
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			for (int x = 0; x < 10; x++) {
				for (int y = 0; y < 10; y++) {
					g.drawLine(this.getWidth() / 10 * x, this.getHeight() / 10 * y, this.getWidth() / 10 * x, this.getHeight());
					g.drawLine(this.getWidth() / 10 * x, this.getHeight() / 10 * y, this.getWidth(), this.getHeight() / 10 * y);
				}
			}
		}
	}
}