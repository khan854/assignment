package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   LinkedHashSet<String> s = new LinkedHashSet<String>();
		
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
