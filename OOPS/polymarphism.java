package OOPS;

public class polymarphism {
 // methods overloading 
   void methods()
   {
	   System.out.println("no agruments methods");
   }
   void methods(int a)
   {
	   System.out.println("one agrument methods");
   }
   void methods(int a , int b)
   {
	   System.out.println("two agruments methods");
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polymarphism obj = new polymarphism();
		obj.methods();
		obj.methods(12);
		obj.methods(12, 2);
	}

}
