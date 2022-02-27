package Chapter10_SwingComponent_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter10_001 extends JFrame {
	private ImageIcon[] images = {new ImageIcon("src/images/ico01.jpg"), new ImageIcon("src/images/ico02.jpg"), new ImageIcon("src/images/ico03.jpg"), new ImageIcon("src/images/ico04.jpg")};
	
	public Chapter10_001() {
		super("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));
		
		for (int i = 0; i < images.length; i++) {
			JLabel imgLabel = new JLabel(images[i]);
			c.add(imgLabel);
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_001();
	}
}