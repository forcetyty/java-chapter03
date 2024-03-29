package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * - Point 코드의 수정이 없다.
 * - Interface 기반의 코드!!!
 * - 아래와 같은 코드는 Vector -> ArrayList -> LinkedList 순으로 발전했다.
 * - 코드의 컴포넌트화!!!
 * 
 */
public class LinkedListTest {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();

		list.add("둘리");
		list.add("마이콜");
		list.add("또치");

		// 순회1
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// 순회2
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// 순회3 (for ~ each)
		for (String s : list) {
			System.out.println(s);
		}
	}

}
