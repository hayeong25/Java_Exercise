package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

// 가위바위보 게임

public class Chapter2_OpenChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String one = sc.next();
		System.out.print("영희 >> ");
		String two = sc.next();
		
		if(one.equals("가위")) {
			if(two.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if(two.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(two.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
		}
		else if(one.equals("바위")) {
			if(two.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(two.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if(two.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		else if(one.equals("보")) {
			if(two.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(two.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(two.equals("보")) {
				System.out.println("비겼습니다.");
			}
		}
		
		sc.close();
	}
}