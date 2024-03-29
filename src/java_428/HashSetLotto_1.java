package java_428;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto_1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Set set = new HashSet();
		Set set2 = new HashSet();
		
		//HashSet은 Set에 상속 받고 있다.
		
		while (true) {
			
			int num = (int)(Math.random() * 45 + 1);
			set.add(new Integer(num)); // 객체타입
			
			if (set.size() == 6) {
				break;
			}
		}
		
		List list = new LinkedList(set);
		
		Collections.sort(list);
		System.out.println(list);
		
		while (true) {
			
			int num = (int)(Math.random() * 45 + 1);
			set2.add(new Integer(num));
			
			if (set2.size() == 7) {
				break;
			}
		}
		
		List list2 = new LinkedList(set2);
		
		System.out.println("Lotto 당첨 번호11");

		Iterator itt = list2.iterator();
		
		while (itt.hasNext()) {
			Object obj = itt.next();
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Lotto 당첨 번호22");
		
		for (int i = 0; i < list2.size() - 1; i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.print(" \n 2등 당첨 번호 : ");
		System.out.println(list2.get(list2.size() - 1));
		
		//위아래 프린트 출력물은 같다.
		
	}
}
