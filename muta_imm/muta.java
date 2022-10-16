package pak3;

public class muta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A obj = new A();
		
		obj.set("shafiq", 1, 20000, 788022765);
		
		obj.get();
	}

}


class A
{
	String name;
	private int id;
	double salary;
	private int phonenumber;
	
	
	void set(String name,int id, double salary, int phonenumber)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.phonenumber=phonenumber;
	}
	
	void get()
	{
		System.out.println("id:"+id);
		
		System.out.println("name :"+name);

		System.out.println("salary:"+salary);

		System.out.println("phone nu:"+phonenumber);

		
	}
}