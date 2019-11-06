package dynamic;

class Base
{
 void show()
 {
	 System.out.println("Hello from Base");
 }
 void displayBase()
	{
		System.out.println("Hello from Display Base");	
	}
}

class Child extends Base
{
	
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
		//Upcasting
		Base b=new Child();
		b.show();
		b.displayBase();
		//b.display();
		
		//Downcasting
		Child cc=(Child)b;
		cc.display();
	}
	
}