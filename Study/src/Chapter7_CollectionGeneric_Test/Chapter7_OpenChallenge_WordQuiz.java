package Chapter7_CollectionGeneric_Test;

import java.util.*;

class Word {
	
	private String e;
	private String k;
	
	public Word(String e, String k) {
		this.e = e;
		this.k = k;
	}
}

public class Chapter7_OpenChallenge_WordQuiz {
	public static void main(String[] args) {
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
	}
}