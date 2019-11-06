package consinheri;

class A2
{
	A2()
	{
		System.out.println("A2");
	}
	
	A2(int x)
	{
		System.out.println(x);
	}
}
class B2 extends A2
{
	B2()
	{
		System.out.println("B2");	
	}
	B2(int x)
	{
		System.out.println(x);	
	}
}
class C2 extends B2
{
	
	C2()
	{
		System.out.println("C2");
	}
	C2(int x)
	{
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		new C2(10);
	}
	
}