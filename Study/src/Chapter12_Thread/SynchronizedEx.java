package Chapter12_Thread;

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter(); // 공유 데이터 생성
		String[] engText = {"Wise men say,", "only fools rush in", "But I can't help, ", "falling in love with you","Shall I stay?", "Would it be a sin?", "If I can't help, ", "falling in love with you"};
		String[] korText = {"동해물과 백두산이 마르고 닭도록, ", "하느님이 보우하사 우리 나라 만세", "무궁화 삼천리 화려강산", "대한 사람 대한으로 길이 보전하세", "남산 위에 저 소나무, 철갑을 두른 듯", "바람서리 불변함은 우리 기상일세", "무궁화 삼천리 화려강산", "대한 사람 대한으로 길이 보전하세"};

		// Thread 생성시 공유 프린터의 주소를 알려줌. 두 Thread는 공유 프린터 p에 동시에 접근
		Thread th1 = new WorkerThread(p, engText); // 영문 출력 Thread
		Thread th2 = new WorkerThread(p, korText); // 국문 출력 Thread
		
		// 두 Thread 실행
		th1.start();
		th2.start();
	}
}

class SharedPrinter { // 두 WorkerThread에 의해 동시 접근되는 공유 프린터
	// synchronized를 생략하면 print()메소드의 동시 접근 충돌. 한글과 영어가 한 줄에 섞여 출력되는 경우가 발생한다.
	synchronized void print(String text) {
		// Thread.yield(); 실행하면 synchronized가 생략될 때 더 많은 충돌 발생
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
}

class WorkerThread extends Thread { // Thread 클래스
	private SharedPrinter p; // 공유 프린터 주소
	private String[] text;
	
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	// Thread는 반복적으로 공유 프린터에 10번 접근해 text[]를 출력한다
	@Override
	public void run() {
		for (int i = 0; i < text.length; i++) { // 한 줄씩 출력
			p.print(text[i]); // 공유 프린터에 출력
		}
	}
}