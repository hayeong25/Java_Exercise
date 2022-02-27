package Practice;

public class Test003 {
	public static void main(String[] args) {
		int[] n = new int[10];
		
		System.out.print("랜덤한 정수들 : ");
		
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 10) + 1;
			System.out.print(n[i] + " ");
		}
		
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		
		double avg = sum / 10;
		System.out.println("\n평균은 " + avg);
	}
}