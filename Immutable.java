package pak2;

class C
{
	private int x;
	C(int x)
	{
		this.x=x;
	}
	
	public int set()
	{
		System.out.println(x);
		return this.x;
		
	}
}
public class Immutable {

	  
	public static void main(String[] args) {

		
		C obj = new C(1);
		obj.set();
		
	}

}
