package reflection;
import java.lang.reflect.*;
public class SampleMethods
{
	public static void printMethods(Object o)
	{
		Class c=o.getClass();
		Method mm[]=c.getMethods();
		for(int i=0;i<mm.length;i++)
		{
			System.out.println(mm[i].getName());
		}
	}
	
	public static void main(String args[])
	{
		String str=new String();
		printMethods(str);
		
	}

}
