package exceptions;

public class Demo
{
public void demo()
{
	int x=10/0;
	System.out.println(x);
	System.out.println("This wont be printed");
	
}

public static void main(String args[])
{
	new Demo().demo();
}
	
}
