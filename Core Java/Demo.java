class Demo
{
	public static void main(String... args)
	{
		System.out.println("Hi");
	}
}

class Test
{
	public static void main(String[] args)
	{
	Demo.main();//explicitly calling
	Demo.main("s","ss");
	Demo.main("a");
	}
}