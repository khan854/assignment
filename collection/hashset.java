package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> s = new HashSet<String>();
		
		s.add("shafiq:");
		s.add("lala");
		s.add("janagha");
		s.add(null);
		s.add("lala");
		
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
