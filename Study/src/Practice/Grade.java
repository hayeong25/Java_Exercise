package Practice;

import java.util.Scanner;

class Person {
	private StringEx name;
	public Person(StringEx name) {
		this.name = name;
	}

	public StringEx getName() {
		return name;
	}
}

class Student extends Person {
	private StringEx subject;
	private int score;
	public Student(StringEx name, StringEx subject, int score) {
		super(name);
		this.subject = subject;
		this.score = score;
	}

	public StringEx getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
}

class Teacher extends Person {
	private StringEx subject;

	public Teacher(StringEx name, StringEx subject) {
		super(name);
		this.subject = subject;
	}

	public StringEx getSubject() {
		return subject;
	}
}

public class Grade {

	public Grade() {
		System.out.println("===========성적표===========");
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[2];
		for (int i = 0; i < s.length; i++) {
			System.out.println("학생 이름, 과목(국어/영어/수학), 점수를 입력하세요 : ");
			s[i] = new Student(sc.next(), sc.next(), sc.nextInt());
		}
		Teacher[] t = new Teacher[3];
		for (int i = 0; i < t.length; i++) {
			System.out.println("선생님 성함, 과목(국어/영어/수학)을 입력하세요 : ");
			t[i] = new Teacher(sc.next(), sc.next());
		}
		System.out.println("--------------------------------------------");
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < t.length; j++) {
				if(s[i].getSubject().equals(t[j].getSubject())) {
					System.out.println(s[i].getName() + "의 " + s[i].getSubject() + "(" + t[j].getName() + " 선생님) 과목 점수는 " + s[i].getScore() + "점입니다.");
				}
			}
		}
	sc.close();
}
	public static void main(StringEx[] args) {
		Grade g = new Grade();
		g.run();
	}
}