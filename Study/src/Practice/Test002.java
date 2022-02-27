package Practice;

import java.util.*;

public class Test002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 10개를 입력하세요 >> ");
		
		int[] n = new int[10];
		
		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}

		System.out.print("\n3의 배수는 : ");
		for (int i = 0; i < 10; i++) {
			if(n[i] % 3 == 0) {
				System.out.print(n[i] + " ");
			}
		}
	}
}