package Chapter5_Inheritance;

public class DowncastingEx {
	public static void main(String[] args) {
		Person p = new Student("이재문"); // 업캐스팅
		Student s;
		
		s = (Student)p; // 다운캐스팅 : 업캐스팅 된 것을 다시 원래대로 되돌리는 것. 타입 변환을 명시적으로 지정해야 한다.
		
		System.out.println(s.name); // 레퍼런스 s는 p가 가리키던 Student 객체를 다시 가리키게 된다.
		s.grade = "A"; // s를 통해 Student 객체 전체 접근 가능
	}
}
