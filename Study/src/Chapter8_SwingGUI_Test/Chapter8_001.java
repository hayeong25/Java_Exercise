package Chapter8_SwingGUI_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter8_001 extends JFrame {
	
	public Chapter8_001() {
		super("Let's study Java");
		
		Container contentPane = getContentPane();
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Chapter8_001();
	}
}