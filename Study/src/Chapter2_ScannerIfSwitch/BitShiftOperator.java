package Chapter2_ScannerIfSwitch;

public class BitShiftOperator {
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		// 비트 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 NOR
		System.out.printf("%04x\n", (short)(~a));
		
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		
		// 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2); // 80
		System.out.println(c >> 2); // 5
		System.out.println(d >> 2); // -2
		System.out.printf("%x\n", (d >>> 2)); // 3ffffffe
		// d(0xf8)는 시프트 연산 전에 int 타입으로 바뀌어 32비트의 fffffff8이 된다.
		// 그러고 나서 >>> 연산이 이루어지면 0이 2번 삽입되어 3ffffffe가 된다.
	}
}