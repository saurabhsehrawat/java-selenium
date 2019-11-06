package consinheri;
class Demo
{
	Demo()
	{
		show();
	}
	void show()
	{
		System.out.println("Demo");
	}
}
class Temp extends Demo
{
	Temp()
	{
		System.out.println("abc");
	}	
	void show()
	{
		System.out.println("Temp");
	}
	public static void main(String args[])
	{
		new Temp();
	}
}