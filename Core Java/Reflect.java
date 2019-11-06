

class Reflect
{

	//Class c=Class.forName("java.lang.System");
	//System.out.println(c.getName());
	static void printName(Object o)
	{
		Class c=o.getClass();
		System.out.println(c.getName());
	}
	static void printName(String s) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class c1=Class.forName(s);
		System.out.println(c1.getName());
		StringBuffer sb=(StringBuffer)c1.newInstance();//newInstance() creates object of class, can only be used in Reflection
		System.out.println(sb.length()+" "+sb.capacity());
	}
	
	public static void main(String a[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Thread t=new Thread();
		printName(t);//passed to Object o
		printName("java.lang.System");//passed to String s
		Class c2=java.lang.Thread.class;//.class loads class dynamically at runtime
		System.out.println(c2.getName());
	}
	
}
