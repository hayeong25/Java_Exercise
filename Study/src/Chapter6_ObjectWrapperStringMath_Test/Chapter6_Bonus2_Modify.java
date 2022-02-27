package Chapter6_ObjectWrapperStringMath_Test;

import java.util.*;

public class Chapter6_Bonus2_Modify {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String s = scanner.nextLine(); // 한 줄 읽기
			StringBuffer sb = new StringBuffer(s); // StringBuffer 객체 생성
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random() * s.length()); // 변경할 문자 위치 선택
			while(true) {
				int i = (int)(Math.random() * 26); // 알파벳 중에서 선택
				char c = (char)('a' + i); // 삽입할 문자 결정
				if(!s.equals(String.valueOf(c))) {
					// sb에서 index에 있는 문자를 문자 c로 변경
					sb.replace(index, index + 1, String.valueOf(c));
					break;
				}
			}
			System.out.println(sb);
		}
		scanner.close();
	}
}