package Chapter13_IOStream_Test;

import java.io.*;

public class Chapter13_003 {
	public static void main(String[] args) {
		File file = new File("c:\\");
		
		File[] subfiles = file.listFiles();
		
		long size = 0;
		String path = null;
		for (int i = 0; i < subfiles.length; i++) {
			File f = subfiles[i];
			if(f.isFile()) {
				if(size < f.length()) {
					size = f.length();
					path = f.getPath();
				}
			}
		}
		
		System.out.println("가장 큰 파일은 " + path + " " + size + "바이트");
	}
}