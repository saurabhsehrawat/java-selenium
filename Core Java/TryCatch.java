public class TryCatch {

	
	public static void main(String s[])
	{
		try
		{
			try
			{
			int x=10/s.length;	
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			try
			{
				int z[]=new int[s.length];
				z[5]=100;
			}
			catch(ArrayIndexOutOfBoundsException ar)
			{
			System.out.println(ar);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Catches rest all exceptions..");
		}
		
		
	}

}
