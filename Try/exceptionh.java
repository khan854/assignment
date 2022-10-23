package Try;

public class exceptionh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int[] a = {4};
		
		System.out.println(a[1]);
		}
		
		catch(NullPointerException ex)
		{
			System.out.println("Your arrray is null ");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("your array index is out of bondery");
		}

		catch(Exception ex)
		{
			System.out.println("somethings is wrong");
		}
	}

}
