package Chapter10_SwingComponent_Test;

import java.awt.*;
import javax.swing.*;

public class Chapter10_002 extends JFrame {
	public Chapter10_002() {
		super("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		createMenu();
		setSize(200, 100);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		
		JMenu one = new JMenu("파일");
		JMenu two = new JMenu("편집");
		JMenu three = new JMenu("보기");
		JMenu four = new JMenu("입력");
		
		three.add(new JMenuItem("화면확대"));
		three.addSeparator();
		three.add(new JMenuItem("쪽윤곽"));
		
		bar.add(one);
		bar.add(two);
		bar.add(three);
		bar.add(four);
		
		setJMenuBar(bar);
	}
	
	public static void main(String[] args) {
		new Chapter10_002();
	}
}