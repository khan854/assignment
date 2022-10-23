package collection;

import java.util.Iterator;
import java.util.Vector;

public class testcollectionVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		
		v.add("ali");
		v.add("wali");
		v.add("kasim");
		
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
