package Chapter11_Graphic_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter11_001_2 extends JFrame {
	public Chapter11_001_2() {
		setTitle("오륜기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(250, 180);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_001_2();
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawOval(30, 30, 50, 50);
			g.setColor(Color.YELLOW);
			g.drawOval(60, 50, 50, 50);
			g.setColor(Color.BLACK);
			g.drawOval(90, 30, 50, 50);
			g.setColor(Color.GREEN);
			g.drawOval(120, 50, 50, 50);
			g.setColor(Color.RED);
			g.drawOval(150, 30, 50, 50);
		}
	}
}