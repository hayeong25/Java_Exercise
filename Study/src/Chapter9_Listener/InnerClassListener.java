package Chapter9_Listener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Aciton");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(200, 120);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener {
		// 이 클래스는 내부 클래스이므로 자신을 둘러싼 외부 클래스인 InnerClassListener나 상속받은 JFrame의 모든 멤버에 접근할 수 있다
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("액션");
			}
			else {
				b.setText("Action");
			}
			
			// InnerClassListener 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText()); // 프레임 타이틀에 버튼 문자열 출력
		}
	}
	
	public static void main(String[] args) {
		new InnerClassListener();
	}
}