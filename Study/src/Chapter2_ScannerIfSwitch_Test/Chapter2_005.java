package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("논리 연산을 입력하세요 >> ");
		boolean one = sc.nextBoolean();
		String op = sc.next();
		boolean two = sc.nextBoolean();
		
		switch(op) {
		case "OR" :
			System.out.println(one);
			break;
		case "AND" :
			System.out.println(two);
			break;
		}
		
		sc.close();
	}
}