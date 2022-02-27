package Practice;

public class Test006 {
	public static void main(String[] args) {
		int n[][] = new int[4][4];
		
		for (int i = 0; i < 10; ) {
			int x = (int)(Math.random() * 4);
			int y = (int)(Math.random() * 4);
			
			if(n[x][y] == 0) {
				n[x][y] = (int)(Math.random() * 10) + 1;
				i++;
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}