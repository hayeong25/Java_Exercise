package Chapter6_ObjectWrapperStringMath;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) { // 사각형 면적 비교
		Rect r = (Rect)obj; // obj를 Rect로 다운 캐스팅
		if((width * height) == (r.width * r.height)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		if(a.equals(b)) {
			System.out.println("a is equal to b"); // a와 b의 면적이 같으므로 equals()는 같다고 판단
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
	}
}