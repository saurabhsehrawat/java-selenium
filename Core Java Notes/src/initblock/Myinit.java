package initblock;

class Myinit
{
	
	{
		System.out.println("Hello from init Block");
	}
	
	{
		System.out.println("Hello from intit block 2");
	}
	Myinit()
	{
		System.out.println("Hello from default cons.");
	}
	
	Myinit(int x)
	{
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		new Myinit(10);
	}
	
	
	
}