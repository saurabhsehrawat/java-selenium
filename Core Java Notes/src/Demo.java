
public class Demo
{
	void show(int x)
	{
		System.out.println("int type function");
	}
	void show(byte b)
	{
		System.out.println("Byte type function");
	}
	void show(short s)
	{
		System.out.println("short type function");
	}
	void show(long l)
	{
		System.out.println("long type function");
	}
	void show(float f)
	{
		System.out.println("float");
	}
	void show(double d)
	{
		System.out.println("double");
	}
	public static void main(String args[])
	{
		Demo dd=new Demo();
		dd.show(3.44f);
	}
	

}
