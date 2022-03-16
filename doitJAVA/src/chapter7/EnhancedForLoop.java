package chapter7;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) { // lang 변수에는 배열의 각 요소가 대입
			System.out.println(lang);
		}
		
	}
}