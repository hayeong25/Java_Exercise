package Chapter5_Inheritance_Test;

class circle1 {
	private int radius;
	
	public circle1(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
}

public class Chapter5_001_NamedCircle extends circle1 {

	String name;
	
	public Chapter5_001_NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	
	public void show() {
		System.out.println(this.name + ", 반지름 = " + super.getRadius());
	}
	
	public static void main(String[] args) {
		Chapter5_001_NamedCircle w = new Chapter5_001_NamedCircle(5, "Waffle");
		w.show();
	}
}