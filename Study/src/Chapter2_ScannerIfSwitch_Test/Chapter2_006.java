package Chapter2_ScannerIfSwitch_Test;

import java.util.Scanner;

public class Chapter2_006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요 >> ");
		int n = sc.nextInt();
		
		int oman = n / 50000;
		int man = (n % 50000) / 10000;
		int cheon = ((n % 50000) % 10000) / 1000;
		int obaek = (((n % 50000) % 10000) % 1000) / 500;
		int baek = ((((n % 50000) % 10000) % 1000) % 500) / 100;
		int sib = (((((n % 50000) % 10000) % 1000) % 500) % 100) / 10;
		int il = ((((((n % 50000) % 10000) % 1000) % 500) % 100) % 10) / 1;
		
		System.out.println("50,000원 " + oman + "개, 10,000원 " + man + "개, 1,000원 " + cheon + "개, 500원 " + obaek + "개, 100원 " + baek + "개, 10원 " + sib + "개, 1원 " + il + "개");
		
		sc.close();
	}
}