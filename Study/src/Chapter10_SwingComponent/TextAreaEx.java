package Chapter10_SwingComponent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20); // 한 줄에 20글자, 7줄 입력 가능
	
	public TextAreaEx() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		// 텍스트 필드에 Aciton 리스너 등록
		tf.addActionListener(new ActionListener() { // <Enter> 키 입력시 작동하는 리스너
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				
				// 텍스트 필드의 문자열을 텍스트 영역에 붙임
				ta.append(t.getText() + "\n"); // getText() : 현재 텍스트 필드에 입력된 문자열 알아냄
				
				t.setText(""); // 현재 텍스트 필드에 입력된 내용 지우기
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}