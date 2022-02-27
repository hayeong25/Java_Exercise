package Chapter5_Inheritance;

class Person {
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("이재문");
		p = s; // 업캐스팅 : 서브 클래스 객체가 슈퍼 클래스 타입으로 변환
		
		System.out.println(p.name); // p는 Person 타입이기 때문에, p로는 Person 클래스의 멤버만 접근 가능
		
//		p.grade = 'A'; >> grade 필드는 Person의 멤버가 아니기 때문에 컴파일 오류
//		p.department = "Com"; >> department 필드는 Person의 멤버가 아니기 때문에 컴파일 오류
	}
}