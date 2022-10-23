package collection;

import java.util.Iterator;
import java.util.Stack;

public class textcollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		
		stack.push("khan");
		stack.push("rahim");
		stack.push("Rashid");
		
		stack.pop();
		
		Iterator<String> itr = stack.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
