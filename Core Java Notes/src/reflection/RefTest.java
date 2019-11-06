package reflection;
import java.lang.reflect.*;

public class RefTest
{
	public static void main(String args[]) throws ClassNotFoundException
	{
		RefTest rft=new RefTest();
		Class c=rft.getClass();
		
		System.out.println(c.getName());	
	}

}
