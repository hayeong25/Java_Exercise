package Chapter5_Inheritance_Test;

interface shape1 {
	final double PI = 3.14; // 상수
	void draw(); // 추상 메소드
	double getArea(); // 추상 메소드
	default public void redraw() { // 코드가 작성된 디폴트 메소드
		System.out.println("--- 다시 그립니다 ---");
		draw();
	}
}

class circle2 implements shape1 {
	int radius;
	
	public circle2(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.print("반지름 " + radius + "\t");
	}

	@Override
	public double getArea() {
		double area = radius * radius * PI;
		return area;
	}	
}

public class Chapter5_Bonus1_ShapeApp {
	public static void main(String[] args) {
		shape1 coin = new circle2(10); // 반지름이 10인 코인 객체 생성
		coin.redraw(); // 코인 다시 그리기
		System.out.println("코인의 면적은 " + coin.getArea());
	}
}