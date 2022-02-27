package Chapter13_IOStream_Test;

import java.util.*;
import java.io.*;

public class Chapter13_OpenChallenge {
	public static void main(String[] args) {
		System.out.println("지금부터 행맨 게임을 시작합니다");
		
		Vector<String> wordVector = new Vector<String>();
		
		Scanner scanner = new Scanner(new FileReader("words.txt"));
		while(scanner.hasNext()) { // 파일의 끝까지 반복하여 읽는다
			String word = scanner.nextLine(); // 한 라인 단위로 읽는다
			wordVector.add(word); // 단어를 벡터에 저장한다
		}
	}
}