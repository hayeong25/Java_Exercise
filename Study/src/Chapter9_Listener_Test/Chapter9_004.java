package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_004 extends JFrame {
	public Chapter9_004() {
		super("+ - 키로 폰트 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		
		la.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial 폰트로 10픽셀 크기
		
		c.addKeyListener(new KeyAdapter() {
			
			Font f = la.getFont(); // 현재 la 폰트 얻기
			
			int size = f.getSize(); // 폰트 크기 알아내기
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					la.setFont(new Font("Arial", Font.PLAIN, size + 5)); // 15픽셀 크기로 폰트 변경
					size += 5;
				}
				if(e.getKeyChar() == '-') {
					if(size > 5) {
						la.setFont(new Font("Arial", Font.PLAIN, size - 5));
						size -= 5;
					}
				}
			}
		});
		
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter9_004();
	}
}