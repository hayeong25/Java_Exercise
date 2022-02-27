package Chapter9_Listener_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter9_Bonus2 extends JFrame {
	public Chapter9_Bonus2() {
		super("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel pa1 = new JPanel();
		pa1.setLayout(new FlowLayout());
		pa1.setBackground(Color.LIGHT_GRAY);
		
		JPanel pa2 = new JPanel();
		pa2.setLayout(new GridLayout(4, 4));
		
		JLabel la1 = new JLabel("수식");
		JLabel la2 = new JLabel("결과");
		
		JTextField jtf1 = new JTextField(10);
		JTextField jtf2 = new JTextField(10);
		
		pa1.add(la1);
		pa1.add(jtf1);
		pa1.add(la2);
		pa1.add(jtf2);
		
		for (int i = 0; i < 10; i++) {
			JButton j = new JButton(Integer.toString(i));
			pa2.add(j);
		}
		
		JButton CE = new JButton("CE");
		JButton cal = new JButton("계산");
		JButton plus = new JButton("+");
		plus.setBackground(Color.GREEN);
		JButton minus = new JButton("-");
		minus.setBackground(Color.GREEN);
		JButton multi = new JButton("*");
		multi.setBackground(Color.GREEN);
		JButton div = new JButton ("/");
		div.setBackground(Color.GREEN);
		
		pa2.add(CE);
		pa2.add(cal);
		pa2.add(plus);
		pa2.add(minus);
		pa2.add(multi);
		pa2.add(div);
		
		c.add(pa1, BorderLayout.NORTH);
		c.add(pa2, BorderLayout.CENTER);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Chapter9_Bonus2();
	}
}