package Chapter7_CollectionGeneric_Test;

import java.util.*;

public class Chapter7_002_ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> array = new ArrayList<String>();
		
		System.out.print("빈 칸으로 분리하여 5개의 학점 입력( A / B / C / D / E ) >> ");
		for (int i = 0; i < 5; i++) {
			array.add(sc.next());
		}
		
		for (int i = 0; i < array.size(); i++) {
			String grade = array.get(i);
			
			switch(grade) {
			case "A" :
				System.out.print("4.0 ");
				break;
			case "B" :
				System.out.print("3.0 ");
				break;
			case "C" :
				System.out.print("2.0 ");
				break;
			case "D" :
				System.out.print("1.0 ");
				break;
			case "E" :
				System.out.print("0.0 ");
				break;
			}
		}
		sc.close();
	}
}