package Chapter6_ObjectWrapperStringMath_Test;

public class Chapter6_003_Random {
	public static void main(String[] args) {
		
		while(true) {
			int array[] = new int[3];
			
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 3 + 1);
				System.out.print(array[i] + "\t");
			}
			
			System.out.println();
			
			if(array[0] == array[1] && array[1] == array[2]) {
				System.out.println("성공");
				System.exit(0);
			}
		}
	}
}