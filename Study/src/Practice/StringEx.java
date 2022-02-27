package Practice;

public class StringEx {
	public static void main(String[] args) {
		
		String java = "Java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res == 0) { // Java와 C++의 사전적 순서가 같으면 0
			System.out.println("the same");
		}
		else if(res < 0) { // 사전적 순서가 Java가 C++보다 먼저면 음수 
			System.out.println(java + " < " + cpp);
		}
		else { // 사전적 순서가 C++이 먼저면 res는 양수
			System.out.println(java + " > " + cpp);
		}
		
		String a = new String(" C#");
		String b = new String(", C++");
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // 문자열의 포함 관계 >> true
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a); // a = " C#, C++"
		
		a = a.trim(); // 문자열 앞 뒤 공백 제거
		System.out.println(a); // a = "C#,C++"
		
		a = a.replace("C#", "Java"); // 문자열 대치
		System.out.println(a); // a = "Java,C++"
		
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i + " : " + s[i]); // s[0] = "Java", s[1] = "C++"
		}
		
		a = a.substring(5); // 문자열 a의 5번째 문자부터 끌까지 서브 스트링 리턴
		System.out.println(a); // a = "C++"
		
		char c = a.charAt(2); // 문자열 a의 2번째 문자 리턴
		System.out.println(c); // '+'9
	}
}
