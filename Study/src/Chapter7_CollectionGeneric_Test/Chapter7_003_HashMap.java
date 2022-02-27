package Chapter7_CollectionGeneric_Test;

import java.util.*;

public class Chapter7_003_HashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> coffee = new HashMap<String, Integer>();
		
		coffee.put("에스프레소", 2000);
		coffee.put("아메리카노", 2500);
		coffee.put("카푸치노", 3000);
		coffee.put("카페라떼", 3500);
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");

		while(true) {
			System.out.print("주문 >> ");
			String key = sc.next();
			
			if(key.equals("그만")) {
				sc.close();
				System.exit(0);
			}
			int value = coffee.get(key);
			System.out.println(key + "는 " + value + "원입니다.");
		}
	}
}