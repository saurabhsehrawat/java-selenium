//...s provides flexibility, need not to create class objects

class DemoMe
{
	public static void main(...s)
	{
	System.out.println("This is Demo");
	}	
}
class Test
{
	public static void main(...a)
	{
	System.out.println("This is Test");
	DemoMe.main();
	
	}
}
