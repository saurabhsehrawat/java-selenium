package stringhandling;

public class StringCharArrayCons
{
	
	public static void main(String args[])
	{
		char ch[]={'s','k','y',' ','i','n','f','o','t','e','c','h'};
		
		String s1=new String(ch);
		System.out.println(s1);
		
		//proof that every String is object of String class created implicitly
		System.out.println("hello".length());
		
		//String(char ch[],int position,int no. of chars)
		String s2=new String(ch,4,3);
		
		String ssss=10+20+"hello";
		
		System.out.println(ssss);
		System.out.println(s2);
	}

}
