
public class TestCase
{
	int x;
	String st;
	public TestCase(int y) 
	{
	System.out.println(y);
	}
	public TestCase(String s)
	{
		System.out.println(st);
	}
	void show()
	{
		System.out.println("show");
	}
	public static void main(String args[])
	{
		TestCase tt=new TestCase(10);
		tt.show();
		TestCase t2=new TestCase("args");
		
	}

}
