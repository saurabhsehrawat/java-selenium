package consinheri;
class A
{
	A()
	{
		System.out.println("Hello from A");
	}
}

class B extends A
{
	B()
	{
		
	}
	
}

class C extends B
{
	C()
	{
		System.out.println('C');
	}
	
	C(int x)
	{
		System.out.println(x);	
	}
	
	public static void main(String args[])
	{
		new C();
	}
}