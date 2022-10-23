package collection;

import java.util.HashMap;

public class hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String ,Integer> has = new HashMap<>();
		// for university students
	  has.put("kandahar", 2000);
	  has.put("kabul",23000);
	  has.put("zabul", 1000);
	  has.put("khost",24000);
	  
	  
	  Integer population = has.get("kabul");
	  
	  if(has.containsKey("kabul"))
	  {
		  System.out.println("we got the kabul population..");
	  }
	  Integer populations = has.get("kandahar");
	  
	  if(has.containsKey("kandahar"))
	  {
		  System.out.println("we got the kdr population...");
		  
	  }
		  

	  
	  
	  
	  
	  
		
	}

}
