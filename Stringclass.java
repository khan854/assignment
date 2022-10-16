package pak4;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my name is shafiq";
		System.out.println(s);
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.charAt(1));
		
		System.out.println();
		
		String str1 = "shafiq";
		
		String str2 = new String("khan");
		
		String str3 = new String("KHAN");
		
		System.out.println(str1.compareToIgnoreCase(str2));
		
		System.out.println(str1.compareToIgnoreCase(str3));
		
		System.out.println(str2.compareToIgnoreCase(str3));
		
		System.out.println(str1.compareTo(s));
		
		System.out.println(str2.compareTo(str1));
		
		System.out.println(" ");
		
		String str4 = new String ("its ok");
		
		String str5 = new String ("its ok");
		
		System.out.println(str1.contentEquals(str2));
		
		System.out.println(str4.contentEquals(str5));
		
		System.out.println( " " );
		
		String s1 = "hi";
		System.out.println("..........");
		System.out.println(s1.concat(":>shafiqTareen"));
		
		char[] list1 = {'H','e','l','l','o'};
		String list2 = "";
		
		System.out.println(".............");
		System.out.println(list2.copyValueOf(list1));
		System.out.println(list2.copyValueOf(list1));
		
		
		 
		
	}

}
