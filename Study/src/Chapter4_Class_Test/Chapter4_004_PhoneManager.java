package Chapter4_Class_Test;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class Chapter4_004_PhoneManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 >> ");
		int number = sc.nextInt();
		
		Phone[] p = new Phone[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력) >> ");
			p[i] = new Phone(sc.next(), sc.next());
		}
		
		System.out.println("저장되었습니다...");
		
		boolean check = false;
		
		while(true) {
			System.out.print("검색할 이름 >> ");
			String s = sc.next();
			
			if(s.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				sc.close();
				System.exit(0);
			}
			
			for (int i = 0; i < p.length; i++) {
				if(s.equals(p[i].getName())) {
					System.out.println(p[i].getName() + "의 번호는 " + p[i].getTel() + "입니다.");
					check = true;
				}
			}
			
			if(!check) {
				System.out.println(s + "이(가) 없습니다.");
			}
		}
	}
}