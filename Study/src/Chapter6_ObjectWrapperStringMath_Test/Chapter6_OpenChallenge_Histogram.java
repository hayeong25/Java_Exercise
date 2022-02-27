package Chapter6_ObjectWrapperStringMath_Test;

import java.util.Scanner;

public class Chapter6_OpenChallenge_Histogram {
	
	String readString() {
		StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링버퍼 생성
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = sc.nextLine(); // 텍스트 한 라인을 읽는다.
			if(line.equals(";")) { // ';'만 있는 라인이면
				break; // 입력 끝
			}
			sb.append(line); // 읽은 라인 문자열을 스트링버퍼에 추가한다.
		}
		return sb.toString(); // 스트링버퍼의 문자열을 스트링으로 리턴
	}
	
	public static void main(String[] args) {
		
	}
}