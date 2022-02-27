package Chapter13_IOStream_Test;

import java.io.*;
import java.util.*;

public class Chapter13_006 {
	public static void main(String[] args) {
		File f = new File("c:\\Temp\\words.txt");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Vector<String> v = new Vector<String>();
		
		while(true) {
			System.out.print("단어 >> ");
			int count = 0;
			
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			try {
				Scanner filescanner = new Scanner(new FileReader(f));
				while(filescanner.hasNext()) {
					String line = filescanner.nextLine();
					if(line.startsWith(s)) {
						System.out.println(line);
						count++;
					}
					if(count == 0) {
						System.out.println("발견할 수 없음");
					}
					v.add(line);
				}
			} catch (IOException e) {
				System.out.println("입출력 오류");
			}
		}
		
		scanner.close();
	}
}