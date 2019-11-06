package consinheri;

class A3
{
	A3()
	{
		System.out.println("A2");
	}
	
	A3(int x)
	{
		System.out.println(x);
	}
}
class B3 extends A3
{
	B3()
	{
		System.out.println("B2");	
	}
	B3(int x)
	{
		System.out.println(x);	
	}
}
class C3 extends B3
{
	
	C3()
	{
		
		System.out.println("C2");
		
	}
	C3(int x)
	{
		super(10);
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		new C3(20);
	}
	
}