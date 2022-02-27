package Chapter4_Class_Test;

import java.util.Scanner;

class Rect {
	private int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
}

public class Chapter4_003_RectArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rect[] rect = new Rect[4];
		
		for (int i = 0; i < rect.length; i++) {
			System.out.print((i+1) + " 너비와 높이 >> ");
			rect[i] = new Rect(sc.nextInt(), sc.nextInt());
		}
		
		System.out.println("저장하였습니다...");
		
		int sum = 0;
		for (int i = 0; i < rect.length; i++) {
			sum += rect[i].getArea();
		}
		
		System.out.println("사각형의 전체 합은 " + sum);
		
		sc.close();
	}
}