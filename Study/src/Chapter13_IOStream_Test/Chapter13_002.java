package Chapter13_IOStream_Test;

import java.io.*;

public class Chapter13_002 {
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("c:\\windows\\system.ini");
			
			int c;
			while((c = fr.read()) != -1) {
				if(Character.isLowerCase((char)c)) {
					c = Character.toUpperCase((char)c);
				}
				System.out.print((char)c);
			}
			
			fr.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}