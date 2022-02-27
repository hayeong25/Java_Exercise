package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_008 extends JFrame {
	private JLabel[] label = new JLabel[10];
	private int index = 0;
	
	public Chapter10_008() {
		super("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setForeground(Color.MAGENTA);
			label[i].setBounds((int)(Math.random() * 200) + 30, (int)(Math.random() * 200) + 30, 30, 30);
			c.add(label[i]);
			
			label[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					if(label[index] == la) {
						label[index].setVisible(false);
						index++;
					}
					if(index == 10) {
						new Chapter10_008();
						dispose();
					}
				}
			});
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_008();
	}
}