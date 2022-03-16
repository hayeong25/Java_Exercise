package chapter5;

// class : 클래스 만드는 예약어
// student : 클래스 이름

public class Student {

	// 멤버변수
	private static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	int studentID; // 학번
	String studentName; // 학생 이름
	// private String studentName;
	int grade; // 학년
	String address; // 사는 곳
	
	// 생성자
	public Student() {
		serialNum++; // 학생이 생성될 때마다 증가
		studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	// 메소드
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); // 이름, 주소 출력
	}
	
	// 학생의 이름을 반환하는 메소드
	public String getStudentName() {
		return studentName;
	}
	
	// 학생의 이름을 부여하는 메소드
	public void setStudentName(String name) { // 학생 이름을 매개변수로 전달
		studentName = name;
	}
	
	// serialNum의 get() 메소드
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	// serialNum의 set() 메소드
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // Student() 클래스 생성
		studentAhn.studentName = "안현수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
}