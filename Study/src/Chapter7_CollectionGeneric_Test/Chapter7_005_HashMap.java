package Chapter7_CollectionGeneric_Test;

import java.util.*;

public class Chapter7_005_HashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>(); 
		
		System.out.println("나라 이름과 인구를 5개 입력하세요. (예 : Korea 5000)");
		
		String country;
		String name = "";
		int people;
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			country = sc.next();
			people = sc.nextInt();
			nations.put(country, people);
			
			if(max < nations.get(country)) {
				max = nations.get(country);
				name = country;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 (" + name + ", " + max + ")");
		
		sc.close();
	}
}