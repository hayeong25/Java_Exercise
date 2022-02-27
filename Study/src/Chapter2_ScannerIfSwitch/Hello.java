package Chapter2_ScannerIfSwitch;

public class Hello {
	
	public static int sum(int n, int m) {
		return n + m;
	}
	
	public static void main(String[] args) { // main() 메소드에서 실행 시작
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 20); // 메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}