package Chapter3_IterationArrayException_Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter3_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		try {
			int number = sc.nextInt();
			if(number % 2 == 0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
		} catch (InputMismatchException e) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
			System.exit(0);
		} finally {
			sc.close();
		}
	}
}