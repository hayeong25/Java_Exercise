package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피 주문하세요 >> ");
		String coffee = sc.next();
		int number = sc.nextInt();
		
		if(coffee.equals("에스프레소")) {
			System.out.println((2000 * number) + "원입니다.");
		}
		else if(coffee.equals("아메리카노")) {
			System.out.println((2500 * number) + "원입니다.");
		}
		else if(coffee.equals("카푸치노")) {
			System.out.println((3000 * number) + "원입니다.");
		}
		else if(coffee.equals("카페라떼")) {
			System.out.println((3500 * number) + "원입니다.");
		}
		
//		switch(coffee) {
//		case "에소프레소" :
//			System.out.println((2000 * number) + "원입니다.");
//			break;
//		case "아메리카노" :
//			System.out.println((2500 * number) + "원입니다.");
//			break;
//		case "카푸치노" :
//			System.out.println((3000 * number) + "원입니다.");
//			break;
//		case "카페라떼" :
//			System.out.println((3500 * number) + "원입니다.");
//			break;
//		}
		
		sc.close();
	}
}