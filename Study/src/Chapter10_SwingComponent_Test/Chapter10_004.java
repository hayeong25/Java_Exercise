package Chapter10_SwingComponent_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter10_004 extends JFrame {
	public Chapter10_004() {
		super("CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox one = new JCheckBox("버튼 비활성화");
		JCheckBox two = new JCheckBox("버튼 감추기");
		
		JButton button = new JButton("test button");
		
		one.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					button.setEnabled(false);
				}
				else {
					button.setEnabled(true);
				}
			}
		});
		
		two.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					button.setVisible(false);
				}
				else {
					button.setVisible(true);
				}
			}
		});
		
		c.add(one);
		c.add(two);
		c.add(button);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chapter10_004();
	}
}