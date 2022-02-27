package Chapter6_ObjectWrapperStringMath_Test;

public class Chapter6_001_MyPoint {
	
	private int x, y;
	
	public Chapter6_001_MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "MyPoint(" + x + ", " + y + ")";
	}
	
	public static void main(String[] args) {
		Chapter6_001_MyPoint a = new Chapter6_001_MyPoint(3, 20);
		System.out.println(a); // a는 자동으로 a.toString()으로 변환됨
	}
}