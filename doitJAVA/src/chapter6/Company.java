package chapter6;

public class Company {
	
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	
	private Company() {
		
	}
	
	// 인스턴스를 외부에서 참조할 수 있도록 public get() 메소드 구현
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성한 인스턴스 반환
	}
	
	public static void main(String[] args) {
		
		// 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2); // 두 변수가 같은 주소인지 확인
		
	}
	
}