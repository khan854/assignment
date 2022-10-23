package collection;

import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}

}
