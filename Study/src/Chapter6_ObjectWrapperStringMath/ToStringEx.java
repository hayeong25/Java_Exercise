package Chapter6_ObjectWrapperStringMath;

class point2 {
	private int x, y;
	public point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		point2 a = new point2(2, 3);
		System.out.println(a.toString());
		System.out.println(a); // a는 a.toString()으로 자동 변환됨
	}
}