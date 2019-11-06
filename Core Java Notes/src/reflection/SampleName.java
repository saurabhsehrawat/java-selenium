package reflection;
import java.awt.*;
public class SampleName
{	
public static void printName(Object o)
{
	Class c=o.getClass();
	System.out.println(c.getName());
	System.out.println(c.getSuperclass());
}

public static void printName(String s)
{
	try
	{
		Class c=Class.forName(s);
		System.out.println(c.getName());
		//making object via newInstance method
	StringBuffer sb=(StringBuffer)c.newInstance();	
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
public static void main(String args[])
{
	Button b=new Button();
	printName(b);
	
	printName("java.lang.StringBuffer");
	
	Class c=java.lang.Thread.class;
	System.out.println(c.getName());
	System.out.println(c.getSuperclass());
}
}
