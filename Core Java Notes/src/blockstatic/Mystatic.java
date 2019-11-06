package blockstatic;

class Mystatic
{
	Mystatic()
	{
		System.out.println("Hello from Default Constructor");
	}
	
	static
	{
		System.out.println("Hello from static block");	
	}
	
	{
		System.out.println("Hello from init Block");	
		functionStatic2();
		
	}
	
	static
	{
		System.out.println("Hello from second static block");
	}
	
	public static void functionStatic()
	{
		System.out.println("Hello from Function static");
	}
	static
	{
		System.out.println("Hello from Third static block");
		functionStatic();
		main();
	}
	
	public static void functionStatic2()
	{
		System.out.println("Hello from functionStatic 2");
	}
	
	public static void main(String...s)
	{
		Mystatic ms=new Mystatic();
		
	}
	
	
}