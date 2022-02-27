package Chapter3_IterationArrayException_Test;

import java.util.Scanner;

public class Chapter3_002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 10개 입력 >> ");
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		sc.close();
	}
}