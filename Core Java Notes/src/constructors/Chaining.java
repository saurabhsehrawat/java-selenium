package constructors;
class Chaining
{
	Chaining()
	{
	this(10);
	System.out.println("Default");
	}
	
	Chaining(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	
	Chaining(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String args[])
	{
		new Chaining();
	}
	
}