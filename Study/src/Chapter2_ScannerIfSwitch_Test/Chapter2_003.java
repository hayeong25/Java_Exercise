package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요 >> ");
		int x = sc.nextInt();
		
		System.out.println("x = " + x + ", y = " + ((x * x) + (-3 * x) + 7));
		
		sc.close();
	}
}