package stringhandling;

public class ReplaceStringBuffer
{
	public static void main(String args[])
	{
	StringBuffer sb=new StringBuffer("I Love Java");
	
	//StringBuffer sb1=sb.replace(start, end, str)
	sb.replace(2,6,"like");
	
	
	System.out.println(sb);
		
		
	}

}
