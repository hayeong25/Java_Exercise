package Chapter6_ObjectWrapperStringMath_Test;

import java.util.*;

public class Chapter6_004_Stringtokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("덧셈식을 입력하세요.");
		String s = sc.nextLine();
		s.trim();
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s, "+ ");
		int n = st.countTokens();
		
		int array[] = new int[n];
			
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
			
		System.out.println("합은 " + sum);
		
		sc.close();
	}
}