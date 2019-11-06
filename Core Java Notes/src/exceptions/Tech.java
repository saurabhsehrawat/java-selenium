package exceptions;

public class Tech
{
	
	public static void main(String S[])
	{	
		try
		{
			int x=10/S.length;
			System.out.println(x);
			
			int z[]=new int[S.length];
			z[5]=100;
		}
		catch(Exception e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println("Arithmetic Exception");
			}
			if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Array");
			}
			
			
		}
	}

}
