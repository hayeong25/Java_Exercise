package Chapter3_IterationArrayException_Test;

import java.util.Scanner;

public class Chapter3_OpenChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요");
			System.out.println("0 - 99");
			
			int min = 0;
			int max = 99;
			int random = (int)(Math.random() * 100);
			
			for(int i = 1; ; i++) {
				System.out.print(i + ">> ");
				int number = sc.nextInt();
				if(number < random) {
					System.out.println("더 높게");
					min = number;
					System.out.println(min + "-" + max);
				}
				else if(number > random) {
					System.out.println("더 낮게");
					max = number;
					System.out.println(min + "-" + max);
				}
				else if(number == random) {
					System.out.println("맞았습니다.");
					System.out.print("게임을 다시 하시겠습니까(y/n)");
					String s = sc.next();
					if(s.equals("y")) {
						break;
					}
					else if(s.equals("n")) {
						sc.close();
					}
				}
			}
		}
	}
}