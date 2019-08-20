package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		while(q.isEmpty() == false) {
			String s = q.poll();
			System.out.println(s);
		}
		
		//비어있는 경우!!! / null이 나온다.
		//Stack은 배열기반으로 만들어졌다!!!
		String s = q.poll();
		System.out.println(s);
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("또치");
		
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		
		
	}

}
