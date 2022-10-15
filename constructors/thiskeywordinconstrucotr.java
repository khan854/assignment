package constructors;

public class thiskeywordinconstrucotr {

	thiskeywordinconstrucotr()
	{
		this(33);
		System.out.println("zero paramenterize construcotrs");
	}
	
	thiskeywordinconstrucotr(int x)
	{
		this(12,44);
		System.out.println("one constructots");
	}
	thiskeywordinconstrucotr(int x, int y)
	{
		System.out.println("2 parametrize construcors");
	}
	
	public static void main(String[] args) {

		thiskeywordinconstrucotr obj = new thiskeywordinconstrucotr();
		thiskeywordinconstrucotr emp1 = new thiskeywordinconstrucotr();
		emp1.setvalue(1, "khan");
		emp1.show();
	}
	int id;
	String name;
	void setvalue(int i , String n)
	{
		this.id = i;
		this.name=n;
	}
	void show()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
	}

}
