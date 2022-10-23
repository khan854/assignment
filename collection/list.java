package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(23);
		list.add(2);
		list.add(22);
		list.add(1);
		list.add(90);
		
		System.out.println("unsorted -> "+list);
		
		Collections.sort(list);
		
		System.out.println("sorted ->"+list);
	}

}
