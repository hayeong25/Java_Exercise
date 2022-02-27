package Chapter7_CollectionGeneric_Test;

import java.util.*;

public class Chapter7_004_Vector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("2000 ~ 2009년까지 1년 단위로 키(cm) 입력");
		System.out.print(">> ");
		
		for (int i = 0; i < 10; i++) {
			v.add(sc.nextInt());
		}
		
		int dif = 0;
		int index = 0;
		for (int i = 0; i < v.size()-1; i++) {
			if(dif < (v.get(i+1) - v.get(i))) {
				dif = (v.get(i+1) - v.get(i));
				index = i;
			}
		}
		
		System.out.println("가장 키가 많이 자란 년도는 " + (2000 + index) + "년 " + dif + "cm");
		
		sc.close();
	}
}