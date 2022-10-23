package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Testcollectionlinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al = new LinkedList<String>();
		
		al.add("shafiq");
		al.add("ahmad");
		al.add("khan");
		al.add("janahmad");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
