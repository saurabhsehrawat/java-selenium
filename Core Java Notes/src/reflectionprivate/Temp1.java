package reflectionprivate;
import java.lang.reflect.*;

class PrivateObject1
{	
	private void show(int b)
	{
		System.out.println(b);
		System.out.println("Hello from private show");
	}	
}

public class Temp1
{
	public static void main(String args[]) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		PrivateObject1 pob1=new PrivateObject1();
		//Method privatemethod=PrivateObject1.class.getDeclaredMethod("show",String.class);
		//NoSuchMethodException, SecurityException
		Method privatemethod=PrivateObject1.class.getDeclaredMethod("show",Integer.TYPE);
		//Method privatemethod=PrivateObject1.class.getDeclaredMethod("show",Boolean.TYPE);
		// SecurityException
		privatemethod.setAccessible(true);
		//throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
		privatemethod.invoke(pob1,20);
		
	}

}
