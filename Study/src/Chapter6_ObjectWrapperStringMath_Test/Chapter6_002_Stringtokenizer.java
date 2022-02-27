package Chapter6_ObjectWrapperStringMath_Test;

import java.util.*;

public class Chapter6_002_Stringtokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문장을 입력하세요.");
			String s = sc.nextLine();
			
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				sc.close();
				System.exit(0);
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
	}
}