package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner; // Scanner 클래스를 사용하기 위한 import문

public class Chapter2_Bonus1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.print("식을 입력하세요 >> ");
		double op1 = scanner.nextDouble(); // 첫 번째 피연산자 입력
		String operator = scanner.next(); // 연산자 스트링 입력
		double op2 = scanner.nextDouble(); // 두 번째 피연산자 입력
		
		double result = 0;
		
		switch(operator) {
		case "+" :
			result = op1 + op2;
			break;
		case "-" :
			result = op1 - op2;
			break;
		case "*" :
			result = op1 * op2;
			break;
		case "/" :
			if(op2 == 0) { // 나누는 수가 0이면
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			result = op1 / op2;
			break;
		default :
			System.out.println("연산 기호가 잘못되었습니다.");
		}
		
		System.out.println("연산 결과 " + result); // 연산 결과 출력
		
		scanner.close();
	}
}