package Chapter11_Graphic;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	public GraphicsDrawLineMouseEx() {
		setTitle("마우스로 여러 개의 선 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
	
	// 선을 그릴 수 있는 패널 구현. 이 패널에 Mouse 리스너 구현
	class MyPanel extends JPanel {
		// 그려진 선을 모두 저장하기 위해 시작점은 vStart에, 끝점은 vEnd 벡터에 각각 저장한다
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			// Mouse 리스너 등록. 마우스 버튼이 눌리면 마우스 포인터(시작점)를 vStart 벡터에 저장하고 마우스 버튼이 떼어지면 마우스 포인터(끝점)를 vEnd 벡터에 기억한다
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint(); // 마우스 포인터를 알아낸다
					vStart.add(startP); // 시작점을 vStart에 저장한다
				}
				
				@Override
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint(); // 마우스 포인터를 알아낸다
					vEnd.add(endP); // 끝점을 vEnd에 저장한다
					
					// 패널의 다시 그리기 요청
					repaint(); // 벡터에 저장 후 repaint() 호출하면 MyPanel이 다시 페인팅 돼 paintComponent() 호출됨. paintComponent() 메소드는 vStart와 vEnd에 지금까지 만들어진 선을 모두 그린다
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); // 파란색 선택
			
			// 벡터에 저장된 선을 모두 그린다
			for (int i = 0; i < vStart.size(); i++) { // vStart 벡터의 크기는 만들어진 선의 개수와 동일
				Point s = vStart.elementAt(i); // 벡터에 들어있는 시작점을 알아낸다
				Point e = vEnd.elementAt(i); // 벡터에 들어있는 끝점을 알아낸다
				
				// 시작점에서 끝점까지 선을 그린다
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}