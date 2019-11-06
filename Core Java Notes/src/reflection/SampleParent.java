package reflection;
import java.awt.*;

public class SampleParent
{
	public static void printSuperClassName(Object o)
	{
		Class subclass=o.getClass();
		Class superclass=subclass.getSuperclass();
		
		while(superclass!=null)
		{
			System.out.println(superclass.getName());
			subclass=superclass;
			superclass=subclass.getSuperclass();
		}
		
	}
	
	public static void main(String args[])
	{
		Frame ff=new Frame();
		printSuperClassName(ff);
	}
	
}
