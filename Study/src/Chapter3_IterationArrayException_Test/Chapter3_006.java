package Chapter3_IterationArrayException_Test;

import java.util.Scanner;


// boolean [변수명]
	// 2가지 값 : true(1), false(0)
	// and, or, not

public class Chapter3_006 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		
		while(true) {
			boolean check = false;
			System.out.print("영어 단어를 입력하세요 >> ");
			String word = sc.next();
			
			if(word.equals("exit")) {
				System.out.println("종료합니다...");
				sc.close();
				System.exit(0);
			}
			for (int i = 0; i < eng.length; i++) {
				if(word.equals(eng[i])) {
					System.out.println(kor[i]);
					check = true;
				}
			}
			if(!check) {
				System.out.println("그런 영어 단어가 없습니다.");
			}
		}
	}
}