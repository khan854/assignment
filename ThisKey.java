package pak2;

 class  C1
 {
	 private int x;
	 
	 C1(int x)
	 {
		 
	 }
	 void setx(int x)
	 {
		 if(x>=0)
		 {
			 this.x=x;
		 }
		 else
		 {
			 this.x=0;
		 }
	 }
	 
	 void show()
	 {
		 System.out.println("the x value is:"+x);
	 }
 }
public class ThisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 obj = new C1(12);
		obj.setx(8);
		obj.show();
	}

}
