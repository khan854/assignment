package collection;

import java.util.LinkedList;

public class LInkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.remove(1);
		list.remove(Integer.valueOf(2));
		
	  list.clear();
	  
	  
	  list.offerFirst(2);
	  list.offerFirst(1);
	  list.offerLast(3);
	  System.out.println(list.pollFirst());
	  System.out.println(list.pollFirst());
	  System.out.println(list.peekLast());
	  
	  
	  
	  
	  list.push(10);
	  list.push(20);
	  list.push(30);
	  System.out.println(list.pop());
	  System.out.println(list.pop());
	  System.out.println(list.pop());
	}

}
