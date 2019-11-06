package reflection;
import java.io.*;
public class SampleInterfaces
{
	public static void printInterfaces(Object o)
	{
		Class c=o.getClass();
		Class inter[]=c.getInterfaces();
		
		for(int i=0;i<inter.length;i++)
		System.out.println(inter[i].getName());	
	}
	
	public static void main(String args[])
	{
		Temp tt=new Temp();
		printInterfaces(tt);
		
	}

}
