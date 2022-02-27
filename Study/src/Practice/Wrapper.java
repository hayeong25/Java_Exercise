package Practice;

public class Wrapper {
	public static void main(StringEx[] args) {
		
		// 박싱(Boxing) 언박싱(Unboxing)
		Integer ten = Integer.valueOf(10); // 박싱 : 기본 타입의 값을 Wrapper 객체로 변환
		int n = ten.intValue(); // 언박싱 : Wrapper 객체를 기본 타입의 값으로 변환
		System.out.println(n);
		
		// Character 사용
		System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
		
		char c1 = '4';
		char c2 = 'f';
		
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "는 숫자"); // 문자 c1이 숫자이면 true
		}
		
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자"); // 문자 c2가 영문자이면 true
		}
		
		// Integer 사용
		System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수로 변환
		System.out.println(Integer.toString(28)); // 정수 28을 2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); // 28을 16진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 28에 대한 2진수의 1의 개수
		
		Integer i = Integer.valueOf(28); // Wrapper 객체 생성
		System.out.println(i.doubleValue()); // 정수를 double 값으로 변환. 28.0
		
		// Double 사용
		Double d = Double.valueOf(3.14); // Wrapper 객체 생성
		System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로 변환
		
		// Boolean 사용
		boolean b = (4>3); // true
		System.out.println(Boolean.toString(b)); // true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 "false"로 변환
	}
}
