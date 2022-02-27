package Chapter4_Class_Test;

public class Chapter4_006_Box {
	private int width, height; // 박스의 너비와 높이
	private char fillChar; // 박스를 그리는 데 사용하는 문자
	
	public Chapter4_006_Box() { // 매개 변수 없는 생성자. 10x1 박스 생성
		this(10, 1);
	}
	
	public Chapter4_006_Box(int width, int height) { // 너비, 높이의 두 매개 변수를 가진 생성자
		this.width = width;
		this.height = height;
	}
	
	public void draw() { // 박스 그리는 메소드
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(fillChar);
			}
			System.out.println();
		}
	}
	
	public void fill(char c) { // 박스를 그리는 데 사용하는 문자 설정
		this.fillChar = c;
	}
	
	public static void main(String[] args) {
		Chapter4_006_Box a = new Chapter4_006_Box(); // 10x1 사각형 
		Chapter4_006_Box b = new Chapter4_006_Box(20, 3); // 20x3 사각형
		a.fill('*'); // box를 그릴 때 사용하는 문자 '*'
		b.fill('%'); // box를 그릴 때 사용하는 문자 '%'
		a.draw(); // 박스 a 그리기
		b.draw(); // 박스 b 그리기
	}
}