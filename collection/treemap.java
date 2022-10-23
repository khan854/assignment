package collection;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String , Integer> sorting = new TreeMap<>();
			sorting.put("key1", 1);
			sorting.put("key2", 2);
			sorting.put("key3", 3);
			sorting.put("key5", 4);
			sorting.put("key4", 5);
			
			sorting.entrySet().forEach(System.out::println);
			
			System.out.println("................");
			System.out.println(sorting.higherEntry("key2"));
			System.out.println(sorting.higherEntry("key2"));

		
				
				
	}

}
