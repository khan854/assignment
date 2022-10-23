package collection;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();
		
		set.add(23);
		set.add(10);
		set.add(10);
		set.add(23);
		set.add(100);
		
		System.out.println(set);
	}

}
