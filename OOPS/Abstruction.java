package OOPS;

public class Abstruction {

	public static void main(String[] args) {

		C obj = new C();
		obj.methods();
		obj.display();
		obj.show();
	}

}
abstract class Parents
{
	public void show()
	{
		System.out.println("this is normal methods....");
	}
	public abstract void methods();
	public abstract void display();

}

class C extends Parents
{

	@Override
	public void methods() {

		System.out.println("this is the methods of pa");
	}

	@Override
	public void display() {

		System.out.println("this is abstauct methods ...");
	}
	
}