package reflection;
//will take only public data members of a class
import java.awt.*;
import java.lang.reflect.*;

public class SampleFields
{
	public static void printFields(Object o)
	{
		Class c=o.getClass();
		
		//Filed class
		Field f[]=c.getFields();
		
		for(int i=0;i<f.length;i++)
		{
			System.out.println(" ");
			Class type=f[i].getType();
			System.out.println(type);
			System.out.println(" "+f[i].getName());
		}
		
	}
	public static void main(String args[])
	{
		Button ss=new Button();
		printFields(ss);
	}

}
