package overiding;


class Base
{
	 void show()
	{
		System.out.println("Hello from Base");
	}
}

class Child extends Base
{
	void show()
	{
		System.out.println("Hello from Child");
	}
	
	public static void main(String args[])
	{
		Child cc=new Child();
		cc.show();
	}
}