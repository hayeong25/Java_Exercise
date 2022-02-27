package Chapter11_Graphic_Test;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter11_005 extends JFrame {
	public Chapter11_005() {
		setTitle("마우스로 다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter11_005();
	}
	
	class MyPanel extends JPanel {
		private Vector<Point> v = new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Point p = e.getPoint();
					v.add(p);
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			for (int i = 0; i < v.size()-1; i++) {
				g.drawLine(v.elementAt(i).getX(), v.elementAt(i).getY(), v.elementAt(i+1).getX(), v.elementAt(i+1).getY());
			}
		}
	}
}