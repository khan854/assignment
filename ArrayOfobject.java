package pak2;

public class ArrayOfobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj1 = new Student("jan",1);
		Student obj = new Student("khan",2);
		Student obj2 = new Student("shafiq",3);
//		System.out.println(obj1);
//		System.out.println(obj);
//		System.out.println(obj2);
//		
		// array of refrence
		
		Student[] students = new Student[3];
		students[0]=obj1;
		students[1]=obj;
		students[2]=obj2;
		
		for(Student s : students)
		{
			System.out.println(s);
		}
		
		
	}

}

class Student
{
	String Name;
	int roll;
	
	public Student(String Name, int roll)
	{
		this.Name=Name;
		this.roll=roll;
	}
	
	public String toString()
	{
		
		System.out.println("roll:"+roll);
		return Name;
		
	}
}