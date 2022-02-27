package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 층인지 입력하세요 >> ");
		int height = sc.nextInt();
		
		System.out.println((height * 5) + "m입니다.");
		
		sc.close();
	}
}