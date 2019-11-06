package abstraction;
 abstract class Base
{
	int x=10;
	
	void show()
	{
		System.out.println(x);
	}
}

class Child extends Base
{
	int x=20;
	void show()
	{
		System.out.println(x);
	}
	public static void main(String args[])
	{
		Child cc=new Child();
		cc.show();
		Base bb=new Child();
		System.out.println(bb.x);
	}
}