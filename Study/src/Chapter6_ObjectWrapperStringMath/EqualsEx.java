package Chapter6_ObjectWrapperStringMath;

// equals(Object obj) : 자기 자신과 객체 obj의 객체 내용이 같은지 비교
// == 연산자는 두 객체의 내용물이 같은지 비교하는 것이 아니라, 두 레퍼런스 값을 비교

class point3 {
	private int x, y;
	public point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		point3 p = (point3)obj; // obj를 point3 타입으로 다운 캐스팅
		if(x == p.x && y == p.y ) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		point3 a = new point3(2, 3);
		point3 b = new point3(2, 3);
		point3 c = new point3(3, 4);
		if(a == b) {
			System.out.println("a == b");
		}
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
	}
}