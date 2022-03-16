package chapter2;

/*
	서로 다른 정수 자료형인 byte형 변수와 short형 변수의 값을 더하는 경우
	정수값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에
	두 정수를 더하기 전에 두 정수는 모두 int형으로 변환된다
	연산 결과 값도 int형으로 저장됨
	>> 정수의 기본형은 int형이고, byte형이나 short형은 연산을 편리하게 하려고 내부적으로 int형으로 변환
*/

public class IntegerVariable {
	public static void main(String[] args) {
		
		short sVal = 10;
		byte bVal = 20;
		
		System.out.println(sVal + bVal);
		
	}
}
