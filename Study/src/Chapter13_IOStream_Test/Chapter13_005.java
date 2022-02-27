package Chapter13_IOStream_Test;

import java.io.*;

public class Chapter13_005 {
	public static void main(String[] args) {
		File f = new File("c:\\Temp");
		File[] subfiles = f.listFiles();
		String name = null;
		String path = null;
		
		for (int i = 0; i < subfiles.length; i++) {
			File file = subfiles[i];
			if(file.isFile()) {
				name = file.getName();
				path = file.getPath();
				int n = name.lastIndexOf(".txt");
				
				if(n != -1) {
					System.out.println(path + " 삭제");
				}
			}
		}
	}
}