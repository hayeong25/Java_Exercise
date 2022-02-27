package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 >> ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		System.out.println(one + "+" + two + "은 " + (one + two));
		
		sc.close();
	}
}