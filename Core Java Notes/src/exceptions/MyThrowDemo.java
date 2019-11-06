package exceptions;

public class MyThrowDemo
{
	int age;
	
	void get(int age)
	{
		try{
		if(age<18)
		{
			throw new ArithmeticException("Invalid Age");
		}
		else
		{
			this.age=age;
		}
		}
		catch(ArithmeticException aex)
		{
			System.out.println(aex);
		}
	}
	
	public static void main(String args[])
	{
		MyThrowDemo mt=new MyThrowDemo();
		mt.get(15);
	}

}
