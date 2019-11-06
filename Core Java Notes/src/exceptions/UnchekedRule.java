package exceptions;

public class UnchekedRule
{
	void show() throws ArithmeticException
	{
		int x=10/0;
	}
	
	void display() throws Exception
	{
		show();
	}
	
	public static void main(String args[]) throws Exception
	{
		UnchekedRule un=new UnchekedRule();
		
			un.display();
		
		
		
	}

}
