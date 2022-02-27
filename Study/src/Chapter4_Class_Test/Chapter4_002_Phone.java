package Chapter4_Class_Test;

import java.util.Scanner;

public class Chapter4_002_Phone {
	private String name;
	private String tel;
	
	public Chapter4_002_Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름과 전화번호 입력 >> ");
		Chapter4_002_Phone one = new Chapter4_002_Phone(sc.next(),sc.next());
		
		System.out.print("이름과 전화번호 입력 >> ");
		Chapter4_002_Phone two = new Chapter4_002_Phone(sc.next(),sc.next());
		
		System.out.println(one.getName() + "의 번호 " + one.getTel());
		System.out.println(two.getName() + "의 번호 " + two.getTel());
		
		sc.close();
	}
}