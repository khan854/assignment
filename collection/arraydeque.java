package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> de = new ArrayDeque<String>();
		
		de.add("shafiq");
		de.add("khan");
		de.add("namat");
		
		//traversing elements
		
		for(String str: de)
		{
			System.out.println(str);
		}
		
		
		
	}

}
