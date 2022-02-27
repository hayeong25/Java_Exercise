package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Chapter10_Bonus1 extends JFrame {
	public Chapter10_Bonus1() {
		super("단어 사전 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la1 = new JLabel("영어");
		JLabel la2 = new JLabel("한글");
		JLabel la3 = new JLabel();
		JTextField tf1 = new JTextField(10); 
		JTextField tf2 = new JTextField(10);
		JButton bt1 = new JButton("저장");
		bt1.setBackground(Color.YELLOW);
		JButton bt2 = new JButton("찾기");
		bt2.setBackground(Color.GREEN);
		JButton bt3 = new JButton("삭제");
		bt3.setBackground(Color.MAGENTA);
		JButton bt4 = new JButton("모두보기");
		bt4.setBackground(Color.CYAN);
		JTextArea ta = new JTextArea(10, 20);
		
		c.add(la1);
		c.add(tf1);
		c.add(la2);
		c.add(tf2);
		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		c.add(bt4);
		c.add(la3);
		c.add(new JScrollPane(ta), BorderLayout.SOUTH);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append("삽입(" + tf1.getText() + ", " + tf2.getText() + ")\n");
				map.put(tf1.getText(), tf2.getText());
				la3.setText(Integer.toString(map.size()));
				tf1.setText("");
				tf2.setText("");
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf2.setText(map.get(tf1.getText()));
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				map.remove(tf1.getText());
				tf1.setText("");
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Set<String> s = map.keySet();
				Iterator<String> it = s.iterator();
				ta.setText("");
				while(it.hasNext()) {
					String key = it.next();
					String value = map.get(key);
					ta.append("단어 (" + key + ", " + value + ")\n");
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter10_Bonus1();
	}
}