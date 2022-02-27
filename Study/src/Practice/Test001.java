package Practice;

import java.util.*;

public class Test001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			int number = money / unit[i];
			if(number != 0) {
				System.out.println(unit[i] + "원짜리 : " + number + "개");
			}
			money = money % unit[i];
		}
	}
}