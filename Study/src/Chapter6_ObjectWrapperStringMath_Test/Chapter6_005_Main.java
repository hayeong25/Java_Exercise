package Chapter6_ObjectWrapperStringMath_Test;

class Adder {
	private int x, y;
	public Adder(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int add() {
		return x + y;
	}
}

public class Chapter6_005_Main {
	public static void main(String[] args) {
		Adder adder = new Adder(2, 5);
		System.out.println(adder.add()); // 7 출력
	}
}