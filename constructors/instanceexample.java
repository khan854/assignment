package constructors;

public class instanceexample {


	String name;
	double pasprtnumber;
	double number;
	
	instanceexample(String name)
	{
		this.name=name;
		System.out.println("welcome to kda");
	}
	instanceexample(String name, double pasprtnumber)
	{
		this.name=name;
		this.pasprtnumber = pasprtnumber;
		System.out.println("welocm to kondoz");
	}
	instanceexample(String name, double pasrtnumber,double number)
	{
		this.name=name;
		this.pasprtnumber=pasprtnumber;
		this.number=number;
		System.out.println("welcome to kabul");
	}
	
	//instance block
	{
	
		System.out.println("welcome to afgh");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		instanceexample obj = new instanceexample("khan",234,95868);
	}

}
