package io;
import java.util.StringTokenizer;
public class MyStringTokenizer
{
	public static void main(String[] args)
	{
		String str = "This is String @ split by StringTokenizer @ skyinfotech";
		StringTokenizer st = new StringTokenizer(str);
 
		System.out.println("---- Split by space ------");
		
		while (st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
 
		System.out.println("---- Split by '@' ------");
		StringTokenizer st2 = new StringTokenizer(str, "@");
 
		while (st2.hasMoreElements())
		{
			System.out.println(st2.nextElement());
		}
	}
}