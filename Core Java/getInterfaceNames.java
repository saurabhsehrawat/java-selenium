

class getInterfaceNames implements TestInterface
{
	
		public void show()
	{
		System.out.println("Show");
	}
		public void ShowMe()
	{
		System.out.println("ShowMe");
	}
		public void TestMe()
	{
		System.out.println("TestMe");
	}
static void printInterface(Object o)
{
	Class c=o.getClass();
	Class[] inter=c.getInterfaces();
	for(int i=0;i<inter.length;i++)
	{
		System.out.println(inter[i].getName());
	}
}
public static void main(String[] s)
{
	getInterfaceNames t=new getInterfaceNames();
	printInterface(t);
}
}