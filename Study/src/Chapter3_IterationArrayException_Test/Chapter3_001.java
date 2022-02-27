package Chapter3_IterationArrayException_Test;

import java.util.Scanner;

public class Chapter3_001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하세요 >> ");
		char letter = sc.next().charAt(0);
		int n = (int)letter;
		
		for(int i = 97; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}