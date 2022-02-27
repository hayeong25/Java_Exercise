package Chapter4_Class_Test;

import java.util.Scanner;

class player1 {
	String name;
	String word;
	
	public String getWordFromUser(String word) {
		this.word = word;
		return word;
	}
	
	public String getWord() {
		return word;
	}

	boolean checkSuccess(String word, String word2) {
		int lastIndex = word.length() - 1; // 마지막 문자에 대한 인덱스
		char lastChar = word.charAt(lastIndex); // 마지막 문자
		char firstChar = word2.charAt(0);
		
		boolean result = false;
		
		if(firstChar == lastChar) {
			result = true;
		}
		
		return result;
	}
}

public class Chapter4_OpenChallenge_WordGameApp {
	public Chapter4_OpenChallenge_WordGameApp() {
		
	}
	
	public static void main(String[] args) {
		player1 p = new player1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int number = sc.nextInt();
		String name[] = new String[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			name[i] = sc.next();
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		String word = "아버지";
		
		while(true) {
			for (int i = 0; i < number; i++) {
				System.out.print(name[i] + " >> ");
				if(p.checkSuccess(word, p.getWordFromUser(sc.next()))) {
					word = p.getWord();
					continue;
				}
				else {
					System.out.println(name[i] + "가 졌습니다.");
					sc.close();
					System.exit(0);
				}
			}
		}
	}
	
	static void run() {
		new Chapter4_OpenChallenge_WordGameApp();
	}
}