package constructors;

public class second {

	
	int id;
	String name;
	double salary;
	second()
	{
		id=1;
		name="ali";
		salary=333;
	}
	
	void setvalue(int i,String n, double s)
	{
		id=i;
		name=n;
		salary=s;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name :"+name);
		System.out.println("salary :"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		second obj = new second();
		obj.setvalue(1, "khan", 4777);
		obj.display();
	}

}
