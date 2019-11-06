package reflection;
import java.awt.*;
import java.lang.reflect.*;

public class SampleConstructors
{
	public static void printConstructors(Object o)
	{
		Class c=o.getClass();
		Constructor cons[]=c.getConstructors();
		for(int i=0;i<cons.length;i++)
		{
			System.out.println(c.getName()+"( ");
			Class types[]=cons[i].getParameterTypes();
			for(int k=0;k<types.length;k++)
			{
				System.out.println(types[k].getName()+",");
			}
			System.out.println(")");
			System.out.println(" ");
			
		}
	}
	
	public static void main(String args[])
	{
		Thread tt=new Thread();
		printConstructors(tt);
	}

}
