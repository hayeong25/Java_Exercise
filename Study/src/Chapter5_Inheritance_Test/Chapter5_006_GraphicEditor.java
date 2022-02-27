package Chapter5_Inheritance_Test;

import java.util.Scanner;

abstract class Shape {
	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class Chapter5_006_GraphicEditor {
	Scanner sc = new Scanner(System.in);
	
	public void Insert() {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
		int one = sc.nextInt();
		
		switch(one) {
		case 1 :
			
		case 2 :
			
		case 3 :
		}
	}
	
	public void Delete() {
		System.out.print("삭제할 도형 Line(1), Rect(2), Circle(3) >> ");
		int two = sc.nextInt();
		
		switch(two) {
		case 1 :
			
		case 2 :
			
		case 3 : 
		}
	}
	
	public void Show() {
		
	}
	
	public Chapter5_006_GraphicEditor() {
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >> ");
			int number = sc.nextInt();
			
			switch(number) {
			case 1 :
				Insert();
			case 2 :
				Delete();
			case 3 : 
				Show();
			case 4 :
				System.out.println("프로그램을 종료합니다...");
				sc.close();
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new Chapter5_006_GraphicEditor();
	}
}