package Chapter13_IOStream_Test;

import java.io.*;
import java.util.*;

public class Chapter13_004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("텍스트 파일 이름을 입력하세요 >> ");
		String path = scanner.nextLine();
		
		int number = 1;
		
		try {
			Scanner fileScanner = new Scanner(new FileReader(path));
			while(fileScanner.hasNext()) {
				System.out.println(number + " : " + fileScanner.nextLine());
				number++;
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
		scanner.close();
	}
}