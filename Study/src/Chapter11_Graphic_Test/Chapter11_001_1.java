package Chapter11_Graphic_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter11_001_1 extends JFrame {
	public Chapter11_001_1() {
		setTitle("삼색원");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_001_1();
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillArc(30, 30, 100, 100, -30, 120);
			g.setColor(Color.RED);
			g.fillArc(30, 30, 100, 100, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(30, 30, 100, 100, 210, 120);
		}
	}
}