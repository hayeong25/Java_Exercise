package chapter5;

public class StudentTest3 {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "안현수";
		System.out.println(student1.getSerialNum()); // serialNum 변수의 초기값 출력
		System.out.println(student1.studentName + " 학번 : " + student1.studentID);
		student1.setSerialNum(student1.getSerialNum() + 1); // static 변수값 증가

		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getSerialNum());
		System.out.println(student2.studentName + " 학번 : " + student2.studentID);

		System.out.println(student1);
		System.out.println(student2);
		
	}
}
