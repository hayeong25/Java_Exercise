package Chapter6_ObjectWrapperStringMath;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		System.out.println("==========");
		int n = st.countTokens(); // 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);
		while(st.hasMoreTokens()) { // for(int i = 0; i < n; i++)와 동일
			String token = st.nextToken(); // 토큰 얻기
			System.out.println(token); // 토큰 출력
		}
		
		System.out.println("==========");
		
		StringTokenizer a = new StringTokenizer(query, "&=");
		System.out.println("토큰 개수 = " + a.countTokens());
		while(a.hasMoreTokens()) {
			String to = a.nextToken();
			System.out.println(to);
		}
		
		System.out.println("==========");
	}
}