package OOPS;

class Father
{
	void m()
	{
		System.out.println("mehods in father");
	}
	void display()
	{
		System.out.println("iam father class display methods...");
	}
}

class child extends Father
{
	void show()
	{
		System.out.println("iam child class mehtos ....");
	}
	void m()
	{
		System.out.println("methods in child");
	}
}
public class Overriding {

	public static void main(String[] args) {

		child obj = new child();
		obj.display();
		obj.m();
		obj.show();
	}

}
