package chapter5;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student studentAhn = new Student(); // Student() 클래스 생성
		studentAhn.studentName = "안승연";
		// studentAhn.setStudentName("안승연");
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}