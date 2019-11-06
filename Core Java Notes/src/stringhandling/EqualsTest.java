package stringhandling;

public class EqualsTest
{
	public static void main(String args[])
	{
		String s1="Hello ";
		
		String s2=new String("Hello ");
		System.out.println(" == Operator Test");
		if(s1==s2)
		{
			System.out.println("Equal");
		}
		else
		{
		System.out.println("Not Equal");	
		}
		
		System.out.println("equals method test");
		
		if(s1.equals(s2))
		{
			System.out.println("Yes equal by content");
		}
		else
		{
			System.out.println("Not equal by content");
		}	
	}
}
