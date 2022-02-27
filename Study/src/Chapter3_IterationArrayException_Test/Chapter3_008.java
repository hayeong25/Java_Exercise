package Chapter3_IterationArrayException_Test;

import java.util.Scanner;

public class Chapter3_008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보! >> ");
			String user = sc.next();
			
			String array[] = {"가위", "바위", "보"};
			int com = (int)(Math.random() * 3);
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				sc.close();
				System.exit(0);
			}
			
			if(array[com].equals("가위")) {
				if(user.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 비겼습니다.");
				}
				else if(user.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 사용자가 이겼습니다.");
				}
				else if(user.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 컴퓨터가 이겼습니다.");
				}
			}
			else if(array[com].equals("바위")) {
				if(user.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 컴퓨터가 이겼습니다.");
				}
				else if(user.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 비겼습니다.");
				}
				else if(user.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 사용자가 이겼습니다.");
				}
			}
			else if(array[com].equals("보")) {
				if(user.equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 사용자가 이겼습니다.");
				}
				else if(user.equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 컴퓨터가 이겼습니다.");
				}
				else if(user.equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + array[com] + ", 비겼습니다.");
				}
			}
		}
	}
}