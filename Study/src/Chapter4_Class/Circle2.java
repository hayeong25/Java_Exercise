package Chapter4_Class;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2() { // 매개 변수 없는 생성자. 생성자 이름은 클래스 이름과 동일
		radius = 1; // radius의 초기값은 1
		name = "";
	}
	
	public Circle2(int r, String n) { // 매새변수를 가진 생성자. 생성자는 리턴 타입 없음
		radius = r;
		name = n; // 생성자는 radius와 name 필드 초기화
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "자바피자"); // Circle2 객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle2 donut = new Circle2(); // Circle2 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}