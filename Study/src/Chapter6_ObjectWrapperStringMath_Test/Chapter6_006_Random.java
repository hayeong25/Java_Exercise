package Chapter6_ObjectWrapperStringMath_Test;

import java.util.Scanner;

public class Chapter6_006_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String com = "";
		String user = "";
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 종료(4) >> ");
			int number = sc.nextInt();
			switch(number) {
			case 1 :
				user = "가위";
				break;
			case 2 :
				user = "바위";
				break;
			case 3 :
				user = "보";
				break;
			case 4 :
				System.out.println("게임을 종료합니다...");
				sc.close();
				System.exit(0);
			}
			
			int r = (int)(Math.random() * 3);
			
			switch(r) {
			case 0 :
				com = "가위";
				break;
			case 1 :
				com = "바위";
				break;
			case 2 :
				com = "보";
				break;
			}
			
			System.out.println("사용자 " + user + " : 컴퓨터 " + com);
			
			if(user.equals("가위")) {
				if(com.equals("가위")) {
					System.out.println("비겼습니다.");
				}
				else if(com.equals("바위")) {
					System.out.println("사용자가 졌습니다.");
				}
				else if(com.equals("보")) {
					System.out.println("사용자가 이겼습니다.");
				}
			}
			else if(user.equals("바위")) {
				if(com.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else if(com.equals("바위")) {
					System.out.println("비겼습니다.");
				}
				else if(com.equals("보")) {
					System.out.println("사용자가 졌습니다.");
				}
			}
			else if(user.equals("보")) {
				if(com.equals("가위")) {
					System.out.println("사용자가 졌습니다.");
				}
				else if(com.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else if(com.equals("보")) {
					System.out.println("비겼습니다.");
				}
			}
		}
	}
}