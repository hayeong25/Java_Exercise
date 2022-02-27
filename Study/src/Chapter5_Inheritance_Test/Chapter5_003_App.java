package Chapter5_Inheritance_Test;

import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	
	abstract protected int calc(); // 추상 메소드
	
	protected void input() { // 두 정수를 입력받는 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 >> ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	
	public void run() { // 두 정수를 입력받아 계산하고 결과를 출력하는 메소드
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
}

class Adder extends Calculator {
	@Override
	protected int calc() {
		return a + b;
	}
}

class Subtracter extends Calculator {
	@Override
	protected int calc() {
		return a - b;
	}
}

public class Chapter5_003_App {
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}
}