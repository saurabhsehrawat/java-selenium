package stringhandling;

public class StringIntern
{
	public static void main(String args[])
	{
		String s="hello";
		//String s2=s.intern();
		String s1=new String("hello").intern();
		if(s==s1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");	
		}
	}

}
