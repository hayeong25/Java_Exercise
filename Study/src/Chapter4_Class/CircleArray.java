package Chapter4_Class;

class circle1 {
	int radius;
	
	public circle1(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		circle1[] c; // Circle 배열에 대한 레퍼런스 c 선언
		c = new circle1[5]; // 5개의 레퍼런스 배열 생성
		
		for (int i = 0; i < c.length; i++) { // 배열의 개수 만큼
			c[i] = new circle1(i); // i번째 원소 객체 생성
		}
		
		for (int i = 0; i < c.length; i++) { // 배열의 모든 Circle 객체의 면적 출력
			System.out.print((int)c[i].getArea() + " ");
		}
	}
}