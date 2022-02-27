package Chapter5_Inheritance;

class Shape { // 도형의 슈퍼 클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line"); // 메소드 오버라이딩
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect"); // 메소드 오버라이딩
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle"); // 메소드 오버라이딩
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { // Shape를 상속 받은 모든 객체들이 매개 변수로 넘어올 수 있음
		p.draw(); // p가 가리키는 객체에 오버라이딩한 draw() 호출. 동적 바인딩
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line의 draw() 실행
		
		// 다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
		paint(new Shape()); // Shape의 draw() 실행
		paint(new Line()); // 오버라이딩 된 메소드 Line의 draw() 실행
		paint(new Rect()); // 오버라이딩 된 메소드 Rect의 draw() 실행
		paint(new Circle()); // 오버라이딩 된 메소드 Circle의 draw() 실행
	}
}