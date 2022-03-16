package chapter2;

// for : 지정한 문장을 정해진 횟수만큼 반복해서 수행하는 반복문

public class DoubleEx2 {
	public static void main(String[] args) {
		
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) { // 더하기를 10,000번 반복하라는 의미
			dnum = dnum + 0.1;
		}
		
		System.out.println(dnum);
		
	}
}