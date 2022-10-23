package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<String> s = new TreeSet<String>();
		
		s.add("shafiq:");
		s.add("lala");
		s.add("janagha");
		s.add("lala");
		
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
