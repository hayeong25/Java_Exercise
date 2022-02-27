package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 >> ");
		String grade = sc.next();
		
		switch(grade) {
		case "A" : case "B" :
			System.out.println("Excellent");
			break;
		case "C" : case "D" :
			System.out.println("Good");
			break;
		case "F" :
			System.out.println("Bye");
			break;
		}
		
		sc.close();
	}
}