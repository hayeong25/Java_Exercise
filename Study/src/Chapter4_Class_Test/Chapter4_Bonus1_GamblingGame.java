package Chapter4_Class_Test;

import java.util.Scanner;

class player { // 선수를 표현하는 클래스
	private String name;
	
	public player(String name) { // 생성자
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class Chapter4_Bonus1_GamblingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		player[] p = new player[2]; // 선수 배열 선언
		for (int i = 0; i < p.length; i++) { // 두 선수의 이름을 입력받는다.
			System.out.print("선수 이름 입력 >> "); // 프롬프트 출력
			p[i] = new player(scanner.next()); // 각 선수 객체 생성
		}
		
		int n = 0; // 두 선수가 번갈아 게임하기 위한, n은 배열 p[]의 인덱스
		while(true) {
			System.out.print(p[n].getName() + " <Enter 외 아무 키나 치세요> ");
			scanner.next(); // 입력 받은 키를 읽고 버림
			
			int[] val = new int[3]; // 랜덤 정수를 저장할 정수 배열 생성
			for (int i = 0; i < val.length; i++) {
				val[i] = (int)(Math.random() * 3); // 0 ~ 2 사이의 랜덤 수 발생
				System.out.print(val[i] + "\t"); // 3개의 정수 출력
			}
			System.out.println();
			
			if((val[0] == val[1]) && (val[1]) == val[2]) {
				System.out.println(p[n].getName() + "이(가) 승리하였습니다.");
				break;
			}
			
			n++; // 다음 선수 인덱스
			n = n % 2; // 인덱스가 2가 되면 다시 0으로 돌리기 위해
		}
		scanner.close();
	}
}