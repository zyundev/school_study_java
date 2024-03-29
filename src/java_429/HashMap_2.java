package java_429;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("나자바", new Integer(90));
		map.put("나자바", new Integer(100)); 
		// 중복 이름의 점수가 가장 마지막에 실행된 값을 가져온다.
		map.put("안자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("이자바", new Integer(90));
		
		Set set = map.entrySet();
		// entryset() : HashMap 에 저장된 키와 값을 엔트리(키와 값의 결합)
		// set 에 저장하여 반환
		
		Iterator itt = set.iterator();
		
		while (itt.hasNext()) {
			
			Map.Entry e = (Entry) itt.next();
			
			System.out.println("이름 : " + e.getKey());
			System.out.println("점수 : " + e.getValue());
			
			
		}
		
		System.out.println();
		
		set =  map.keySet();
		System.out.println("참가자 명단" + set);
		
		Collection<Integer> values = map.values();
		
		itt = values.iterator();
		
		int total = 0;
		
		while (itt.hasNext()) {
			Integer ii = (Integer) itt.next();
			System.out.println("zz : " + ii);
			
			total += ii.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total / set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최소 점수 : " + Collections.min(values));
		
	}
}
