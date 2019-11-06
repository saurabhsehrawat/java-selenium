package overiding;


class Base2
{
	Base2 show()
	{
		System.out.println("Hello from Base");
		return new Base2();
	}
	
}


class Child2 extends Base2
{
	Child2 show()
	{
		System.out.println("Hello from child");
		return new Child2();
	}
	
public static void main(String args[])
{
	Child2 cc2=new Child2();
	cc2.show();
}
	
}