package Chapter7_CollectionGeneric_Test;

import java.util.*;

class Location {
	private int x, y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static double distance(Location a, Location b) {
		return Math.sqrt(((b.x - a.x) * (b.x - a.x)) + ((b.y - a.y) * (b.y - a.y)));
	}
}

public class Chapter7_007_ArrayList {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Location> al = new ArrayList<Location>();
		
		System.out.println("쥐가 이동한 위치(x, y)를 5개 입력하라.");
		for (int i = 0; i < 5; i++) {
			System.out.print(">> ");
			al.add(new Location(sc.nextInt(), sc.nextInt()));
		}
	}
}