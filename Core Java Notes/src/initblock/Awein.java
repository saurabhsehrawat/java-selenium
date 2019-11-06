package initblock;


class Awein
{
	
	{
		System.out.println("Hello from init");
	}
	
	Awein()
	{
		System.out.println("Hello from Default");
	}
	
	
	Awein(int x)
	{
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		new Awein(10);
	}
}