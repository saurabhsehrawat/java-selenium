package dynamic;

class Basetwist
{
	int x=10;
	
	void show()
	{
		System.out.println("Hello from Base");
	}
}

class Childtwist extends Basetwist
{
	int x=20;
	
	void show()
	{
		System.out.println("Hello from Child");
	}
	
	void display()
	{
		System.out.println("Hello from Display");
	}
	
	public static void main(String args[])
	{
		Basetwist bt=new Childtwist();
		bt.show();
		Childtwist cc=(Childtwist)bt;
		cc.display();
		System.out.println(bt.x);
		System.out.println(cc.x);
		
	}
}