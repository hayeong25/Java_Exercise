package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_007 extends JFrame {
	
	public Chapter8_007() {
		super("Exam");
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		JPanel north = new JPanel();
		north.setOpaque(true);
		north.setBackground(Color.YELLOW);
		north.add(new JButton("새로 배치"));
		north.add(new JButton("종료"));
		contentPane.add(north, BorderLayout.NORTH);
		
		JPanel center = new JPanel();
		center.setLayout(null);
		for (int i = 0; i < 10; i++) {
			JLabel la = new JLabel("*");
			int x = (int)(Math.random() * 150) + 40;
			int y = (int)(Math.random() * 150) + 40;
			la.setBounds(x, y, 30, 30);
			la.setForeground(Color.RED);
			center.add(la);
		}
		contentPane.add(center, BorderLayout.CENTER);
		
		JPanel south = new JPanel();
		south.setOpaque(true);
		south.setBackground(Color.LIGHT_GRAY);
		south.add(new JButton("별 개수 수정"));
		south.add(new JTextField());
		contentPane.add(south, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_007();
	}
}