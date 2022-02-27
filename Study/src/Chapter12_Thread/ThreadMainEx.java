package Chapter12_Thread;

public class ThreadMainEx {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId(); // Thread ID 얻기
		String name = Thread.currentThread().getName(); // Thread 이름 얻기
		int priority = Thread.currentThread().getPriority(); // Thread 우선순위 얻기
		Thread.State s = Thread.currentThread().getState(); // Thread 상태 값 얻기
		
		System.out.println("현재 Thread 이름 : " + name);
		System.out.println("현재 Thread ID : " + id);
		System.out.println("현재 Thread 우선순위 값 : " + priority);
		System.out.println("현재 Thread 상태 값 : " + s);
	}
}