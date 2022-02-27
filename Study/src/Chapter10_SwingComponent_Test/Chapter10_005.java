package Chapter10_SwingComponent_Test;

import java.io.*;
import java.util.StringTokenizer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_005 extends JFrame {
	public Chapter10_005() {
		super("파일 저장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("파일");
		JMenuItem save = new JMenuItem("저장");
		
		JTextArea text = new JTextArea();
		c.add(new JScrollPane(text), BorderLayout.CENTER);
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String filename = JOptionPane.showInputDialog("저장할 파일명을 입력하세요");
			
				try {
					FileWriter writer = new FileWriter(filename); // 파일 스트림 열기
					String t = text.getText(); // 입력된 텍스트를 문자열로 얻어내기
					StringTokenizer st = new StringTokenizer(text.getText(), "\n"); // 라인 단위로 분리
					
					while(st.hasMoreTokens()) {
						writer.write(st.nextToken());
						writer.write("\r\n"); // 라인 끝에 다음 줄로 넘어가는 문자 삽입
					}
					
					text.setText("");
					writer.close();
				} catch (IOException io) {
					io.printStackTrace();
				}
			}
		});
		
		menu.add(save);
		bar.add(menu);
		
		setJMenuBar(bar);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_005();
	}
}