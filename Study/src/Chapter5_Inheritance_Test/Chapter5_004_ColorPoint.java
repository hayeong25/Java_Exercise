package Chapter5_Inheritance_Test;

class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Chapter5_004_ColorPoint extends Point {

	String color;
	
	public Chapter5_004_ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setPoint(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println(color + "으로 (" + getX() + ", " + getY() + ")");
	}
	
	public static void main(String[] args) {
		Chapter5_004_ColorPoint cp = new Chapter5_004_ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}
}