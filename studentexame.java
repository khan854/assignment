package pak4;





// this is a aggregation relationship

class Name{
	
	String Fullname;
	String Middlename;
	String Lastname;
	
	
	Name(String Fullname, String middlename,String Lastname)
	{
		this.Fullname=Fullname;
		this.Middlename=Middlename;
		this.Lastname=Lastname;
	}
	
	
	
}

class studentexame{
	
	int age;
	Name n;
	
	void display(int age, Name n)
	{
		System.out.println("age :"+age);
		System.out.println("fullname:"+n.Fullname);
		System.out.println("middlename:"+n.Middlename);
		System.out.println("lastName:"+n.Lastname);
	
	}
	
	public static void main(String args[])
	{
		studentexame obj = new studentexame();
		Name n = new Name("shafiq","tareen","raho");
		obj.display(2, n);
	}
	
	
	
}