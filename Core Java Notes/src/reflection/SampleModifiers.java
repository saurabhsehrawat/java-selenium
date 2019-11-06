package reflection;

import java.lang.reflect.Modifier;

public class SampleModifiers
{
public static void printModifiers(Object o)
{
	Class c=o.getClass();
	
	int m=c.getModifiers();
	
	if(Modifier.isPublic(m))
		System.out.println("Public");
	if(Modifier.isFinal(m))
		System.out.println("Final");
	if(Modifier.isAbstract(m))
		System.out.println("Abstract");	
}

public static void main(String args[])
{
	StringBuffer ss=new StringBuffer();
	printModifiers(ss);
}
}
