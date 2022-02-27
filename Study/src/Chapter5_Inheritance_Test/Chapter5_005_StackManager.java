package Chapter5_Inheritance_Test;

interface StackInterface {
	int length(); // 스택에 들어있는 문자열 개수 리턴
	String pop(); // 스택의 톱에 있는 문자열 팝
	boolean push(String ob); // 스택의 톱에 문자열 ob 푸시 삽입
}

class StringStack implements StackInterface {

	@Override
	public int length() {
		
	}

	@Override
	public String pop() {
		
	}

	@Override
	public boolean push(String ob) {
		
	}
	
}

public class Chapter5_005_StackManager {
	public static void main(String[] args) {
		StringStack ss = new StringStack();
	}
}
