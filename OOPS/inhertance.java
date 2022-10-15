package OOPS;

// Single inhertance
class A{
	 void methods1()
	 {
		 System.out.println("the methods 1 for the inhertance...");
	 }
	 void methods2()
	 {
		 System.out.println("the methods 2 for the inhertance...");
	 }
}
class B extends A{
	 void methods3()
	 {
		 System.out.println("the methods 3 for the inhertance...");
	 }
	 void methods4()
	 {
		 System.out.println("the methods 4 for the inhertance...");
	 }
}
// multilevel inhertance
class first{
	 void methods1()
	 {
		 System.out.println("the methods 3 for the inhertance...");
	 }
	 void methods2()
	 {
		 System.out.println("the methods 4 for the inhertance...");
	 }
}
class second extends first{
	 void methods3()
	 {
		 System.out.println("the methods 3 for the inhertance...");
	 }
	 void methods4()
	 {
		 System.out.println("the methods 4 for the inhertance...");
	 }
}
class thired extends second
{
 	 void methods5()
	 {
		 System.out.println("the methods 5 for the inhertance...");
	 }
	 void methods6()
	 {
		 System.out.println("the methods 6 for the inhertance...");
	 }
}
// Hierachical inhertance

class Test{
	
}
class Test2
{
	
}
class T
{
	
}
public class inhertance {


	public static void main(String[] args) {
//		B obj = new B();
//		obj.methods1();
//		obj.methods2();
//		obj.methods3();
//		obj.methods4();


		
	}

}
