package Try;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=10;
		int b=0;
		
		try 
		{
			double result=a/b;

		} 
		
		catch (Exception e) {
			
			System.err.println(e);
		}
	}

}
