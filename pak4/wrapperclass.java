package pak4;


public class wrapperclass {

	
	// wrapper classes provide a way to used primitive data type as refrence data type
	// and wrapper class has some usfull methods
	
	// primitive int Integer boolean Boolean char Character double Double
	// refrence data type String
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 123;
		Boolean b = true;
		Character c = 'A';
		Double d = 233.3;
		
		String s = "shafiq";
		
		//unboxing : convert wrapper class to primitive data type
		//authoboxing : covert primitive data type to wrapper calss
		if(a==123)
		{
			System.out.println("this is true");
		}
		if(b==true)
		{
			System.out.println("this is true");
		}
		if(c=='A')
		{
			System.out.println("this is true");
		}
		if(d==233.3)
		{
			System.out.println("this is true");
		}
	}

}
