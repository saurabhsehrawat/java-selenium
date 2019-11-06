package stringhandling;
public class MyStringConcat
{
	public static void main(String args[])
	{
		//by + operator	
	String s="good";
	s=s+"morning";
	System.out.println(s);
	String s1="hello";
	s1=10+20+s1;
	System.out.println(s1);
		//by concat function
		String s2="ram";
		s2=s2.concat(" is").concat(" a").concat(" good").concat(" boy");
		System.out.println(s2);
			
	}

}
