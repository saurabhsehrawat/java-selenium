package inheritance;

class Base2
{
	int x=10;
}

class Hiding extends Base2
{
	int x=40;
	
	void show()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
	
	public static void main(String args[])
	{
		Hiding cc=new Hiding();
		cc.show();
	}
}