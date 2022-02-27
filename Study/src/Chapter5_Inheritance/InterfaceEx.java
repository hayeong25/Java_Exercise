package Chapter5_Inheritance;

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드 
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface { // 인터페이스 구현
	// PhoneInterface의 모든 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

class Calc {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends Calc implements PhoneInterface { // SmartPhone 클래스는 Calc를 상속 받고, PhoneInterface 인터페이스의 추상 메소드를 모두 구현
	// PhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	
	// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
} 

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		System.out.println();
		
		SmartPhone smart = new SmartPhone();
		smart.printLogo();
		smart.sendCall();
		System.out.println("3과 5를 더하면 " + smart.calculate(3, 5));
		smart.schedule();
	}
}