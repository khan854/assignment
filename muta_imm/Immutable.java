package pak3;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F obj = new F();
		F obj2 = new F();
		
		obj.set(1, "khan", "07854344");
		obj.show();
		obj2.set(2, "shafiq", "075674344");
		obj2.show();
	}

}


class F{
	
	int id;
    private String name;  //immutable
    private String phone; // immutable
    
    
    void set(int id,String name, String phone)
    {
    	
    	this.name=name;
    	this.phone=phone;
    	this.id=id;
    	
    	
    }
    
    
    void show()
    {
    	System.out.println("id:"+id);
        
    	System.out.println("name:"+name);
    	
    	System.out.println("phone:"+phone);
    	System.out.println(".......................");
    }
}