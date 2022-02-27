package Chapter5_Inheritance;

class person {
	
}

class student extends person {
	
}

class Researcher extends person {
	
}

class Professor extends Researcher {
	
}

public class InstanceOfEx {
	static void print(person p) {
		if(p instanceof person) { // instanceof 연산자 : 레퍼런스가 가리키는 객체가 어떤 클래스 타입인지 구분. '레퍼런스'가 가리키는 객체가 해당 '클래스 타입'이면 true 반환
			System.out.print("person ");
		}
		if(p instanceof student) {
			System.out.print("student ");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new student() >> ");
		print(new student());
		System.out.print("new Researcher() >> ");
		print(new Researcher());
		System.out.print("new Professor() >> "); // new Professor() 객체는 person 타입이기도 하고, Researcher, Professor 타입이기도 함
		print(new Professor());
	}
}