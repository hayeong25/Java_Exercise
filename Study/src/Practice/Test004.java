package Practice;

import java.util.*;

public class Test004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇 개? >> ");
		int number = sc.nextInt();
		
		int[] n = new int[number];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < number; i++) {
			if(i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(n[i] + " ");
		}
	}
}