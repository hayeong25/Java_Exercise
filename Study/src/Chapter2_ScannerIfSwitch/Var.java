package Chapter2_ScannerIfSwitch;

// var 키워드 : 타입을 생략하고 변수 선언하는 키워드

public class Var {
	public static void main(String[] args) {
		var price = 200; // price는 int 타입으로 결정
		var name = "kitae"; // name은 String 타입으로 결정
		var PI = 3.14; // PI는 double 타입으로 결정
		
		System.out.println("price = " + (price + 1000));
		System.out.println("name = " + name);
		System.out.println("PI = " + (PI * 10));
	}
}