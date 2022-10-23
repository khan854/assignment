package Try;

import java.util.Scanner;

public class tryca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		
		System.out.println("what's your fav number's");
		
		try {
		int a = s.nextInt();
		System.out.println("fav  number is:"+a);
		
		}
		catch(Exception ex)
		{
			System.out.println("please enter only number");
		}
	}

}
