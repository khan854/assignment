package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> student = new ArrayList<>();
		
		student.add("shafiq");
		student.add("ahmad");
		student.add("waheed");
		student.add("Tareen");
		System.out.println(student.add("lala"));
		student.remove(1);
	
		if(student.contains("shafiq"))
		{
			System.out.println("shafiq in the list");
		}
		if(student.contains("Tareen"))
		{
			System.out.println("tareen in the list");
		}
		if(student.isEmpty())
		{
			System.out.println("the list is empty!");
		}
		
		student.clear();
		
	}

}
