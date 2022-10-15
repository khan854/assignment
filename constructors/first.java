package constructors;

public class first {
	
	
	// constructors 
	// 0-argoument constructors
	first()
	{
		System.out.println("0-argoument constructors");
	}
	// 1-argoument construcots
	first(int s)
	{
		System.out.println("1-argoumetns constructos");
	}
	// tow agroument constuctors
	first(int s, int y)
	{
		System.out.println("1-argoumetns constructos");
	}
	
	public static void main(String args[])
	{
		first obj = new first();
		first obj1 = new first(10);
		first obj2 = new first(12,2);
	}

}
