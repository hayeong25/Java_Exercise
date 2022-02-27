package Chapter3_IterationArrayException_Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter3_004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String weekend[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		while(true) {
			System.out.print("정수를 입력하세요 >> ");
			try {
				int number = sc.nextInt();
				if(number < 0) {
					System.out.println("프로그램 종료합니다...");
					sc.close();
					System.exit(0);
				}
				System.out.println(weekend[(number % 7)]);
			} catch (InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				sc.nextLine();
			}
		}
	}
}