package Chapter7_CollectionGeneric_Test;

import java.util.*;

public class Chapter7_001_Vector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 5개를 입력하세요.");
		
		Vector<Double> v = new Vector<Double>();
		for (int i = 0; i < 5; i++) {
			v.add(sc.nextDouble());
		}
		
		double max = 0;
		for (int i = 0; i < v.size(); i++) {
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
		
		System.out.println("가장 큰 수는 " + max);
		
		sc.close();
	}
}