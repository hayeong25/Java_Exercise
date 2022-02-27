package Chapter7_CollectionGeneric_Test;

import java.util.*;

public class Chapter7_Bonus1_HashMapVector {
	
	public static Vector<String> hashToVector(HashMap<String, String> h) {
		Vector<String> v = new Vector<String>(); // 벡터 생성
		Set<String> s = h.keySet(); // HashMap h로부터 키의 Set 컬렉션 s 얻기
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String key = it.next();
			v.add(h.get(key));
		}
		return v;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>(); // HashMap h 생성
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = hashToVector(h);
		for (int n = 0; n < v.size(); n++) {
			System.out.print(v.get(n) + " ");
		}
	}
}