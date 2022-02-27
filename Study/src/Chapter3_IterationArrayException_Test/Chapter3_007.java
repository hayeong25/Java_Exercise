package Chapter3_IterationArrayException_Test;

public class Chapter3_007 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int first = i / 10;
			int second = i % 10;
			
			if((first == 3) || (first == 6) || (first == 9)) {
				if((second == 3) || (second == 6) || (second == 9)) {
					System.out.println(i + "\t박수두번");
				}
				else {
					System.out.println(i + "\t박수한번");
				}
			}
			else {
				if((second == 3) || (second == 6) || (second == 9)) {
					System.out.println(i + "\t박수한번");
				}
			}
		}
	}
}