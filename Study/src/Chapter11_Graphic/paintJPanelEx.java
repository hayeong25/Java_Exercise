package Chapter11_Graphic;

import java.awt.*;
import javax.swing.*;

public class paintJPanelEx extends JFrame {
	public paintJPanelEx() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel()); // MyPanel 패널을 ContentPane으로 사용
		
		setSize(250, 200);
		setVisible(true);
	}
	
	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // JPanel의 paintComponent() 호출
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(10, 10, 50, 50); // (10, 10) 위치에 50x50 크기의 사각형 그리기
			g.drawRect(50, 50, 50, 50); // (50, 50) 위치에 50x50 크기의 사각형 그리기
			
			g.setColor(Color.MAGENTA); // 마젠타색 선택
			g.drawRect(90, 90, 50, 50); // (90, 90) 위치에 50x50 크기의 사각형 그리기
		}
	}
	
	public static void main(String[] args) {
		new paintJPanelEx();
	}
}