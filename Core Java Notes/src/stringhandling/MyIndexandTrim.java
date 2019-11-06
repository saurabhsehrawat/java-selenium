package stringhandling;

public class MyIndexandTrim
{
	public static void main(String args[])
	{
		
		String s="             india is a good country        ";
		System.out.println(s);
		
	
		
		String s1=s.trim();
		
		System.out.println(s1);
		
		int x=s1.indexOf("r");
		System.out.println(x);
		
		int z=s1.lastIndexOf("i");
		System.out.println(z);
	}

}
