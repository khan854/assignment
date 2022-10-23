package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating arraylist
		ArrayList<String>  list = new ArrayList<String>();
		//adding object in arraylist
		list.add("student1");
		list.add("student2");
		list.add("student3");
		
		//Traversing list through Iterator
		
	     Iterator itr = list.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	}

}
