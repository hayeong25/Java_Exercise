package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
		int n = sc.nextInt();
		
		int first = n / 10;
		int second = n % 10;
		
		if((first == 3) || (first == 6) || (first == 9)) {
			if((second == 3) || (second == 6) || (second == 9)) {
				System.out.println("박수 짝짝");
			}
			else {
				System.out.println("박수 짝");
			}
		}
		else if((first != 3) && (first != 6) && (first != 9)) {
			if((second == 3) || (second == 6) || (second == 9)) {
				System.out.println("박수 짝");
			}
			else {
				System.out.println("박수 없음");
			}
		}
		
		sc.close();
	}
}