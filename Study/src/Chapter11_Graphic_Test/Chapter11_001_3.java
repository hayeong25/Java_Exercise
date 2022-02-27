package Chapter11_Graphic_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter11_001_3 extends JFrame {
	public Chapter11_001_3() {
		setTitle("컨텐트팬에 꽉 차는 마름모");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_001_3();
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawLine(0, this.getHeight() / 2, this.getWidth() / 2, 0);
			g.drawLine(this.getWidth() / 2, 0, this.getWidth(), this.getHeight() / 2);
			g.drawLine(this.getWidth(), this.getHeight() / 2, this.getWidth() / 2, this.getHeight());
			g.drawLine(this.getWidth() / 2, this.getHeight(), 0, this.getHeight() / 2);
		}
	}
}