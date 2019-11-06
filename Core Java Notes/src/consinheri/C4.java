package consinheri;

class A4
{
	A4()
	{
		System.out.println("A2");
	}
	
	A4(int x)
	{
		System.out.println(x);
	}
}
class B4 extends A4
{
	B4()
	{
		System.out.println("B2");	
	}
	B4(int x)
	{
		System.out.println(x);	
	}
}
class C4 extends B4
{
	
	C4()
	{	
		this(20);
		System.out.println("C4");
	}
	C4(int x)
	{
		super(10);
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		new C4();
	}
	
}