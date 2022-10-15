package constructors;

class A
{
	int a=100;
	int b=34;
	int sum=a+b;
	
	public void show()
	{
		System.out.println("this is the a class A :" +sum);
	}
	
}
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// name refrance object
		
//		A obj1 = new A();
//		B obj2 = new B();
//		D obj3 = new D();
//		System.out.println("class a variable :"+obj1.a +"b" +obj1.b);
//		System.out.println("class b variable :"+obj2.a +"b" +obj2.b);
//		System.out.println("class d variable :"+obj3.a +"b" +obj3.b);
//		
//		// access to methods
//		obj1.show();
//		obj2.show();
//		obj3.show();
		
		
//		// name less object
//		new A().show();
//		new B().show();
//		new D().show();

		// local variable accessing 
		Main obj = new Main();
		obj.local();
		int age = obj.a;
		System.out.println("this is the instance variable :"+age);
		System.out.println("this is the static variable :"+sta);
		
	}
	// local variable : local var alwys insid the function and only know this function
			public void  local()
			{
				int s=100-a;
				System.out.println("this is local variable :"+s);
			}
			
	// instance variable: instance var alwys insid the calss and only know this class members not the main methods
	int a = 23;


	//static variable: static varible data type static and when create the class object that's alwys call automethicly 
	
	static int sta = 100;
}

class B
{
	int a=1003;
	int b=344;
	int sum=a+b;
	
	public void show()
	{
		System.out.println("this is the a class B :" +sum);
	}
}
    