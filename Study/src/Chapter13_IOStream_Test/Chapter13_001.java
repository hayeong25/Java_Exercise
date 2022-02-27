package Chapter13_IOStream_Test;

import java.io.*;

public class Chapter13_001 {
	public static void main(String[] args) {
		FileReader fr = null;
		
		int c;
		try {
			fr = new FileReader("c:\\Temp\\sample.txt");
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
			
			fr.close();
		} catch (IOException e) {
			System.out.println("오류");
		}
	}
}