package Chapter3_IterationArrayException;

public class DoWhileSample {
	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a + " "); // 문자 출력
			a = (char)(a + 1); // 알파벡의 경우 1을 더하면 다음 문자의 코드값
		} while(a <= 'z');
	}
}