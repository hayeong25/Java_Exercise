package Chapter6_ObjectWrapperStringMath;

// getClass() : Class 객체 리턴
// hashCode() : 객체가 생성될 때 할당받는 고유한 16진수 정수 값. 실행할 때마다 달라질 수 있음
// toString() : 객체를 문자열로 변환

class point1 {
	private int x, y;
	public point1(int x, int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args) {
		point1 p = new point1(2, 3);
		System.out.println(p.getClass().getName()); // 클래스 이름
		System.out.println(p.hashCode()); // 해시 코드 값
		System.out.println(p.toString()); // 객체의 문자열
	}
}