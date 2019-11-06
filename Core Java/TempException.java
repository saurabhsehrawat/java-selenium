class TempException
{
	int age;
	void get(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Invalid age....")
			else{this.age=age};
		}
		
	public static void main(String[] a)
	{
	TempException t=new TempException();
	try
	{
	t.get(15);
	}
	catch(MyException e)
	{
	System.out.println(e);
	}
}
}

class MyException extends TempException
{
	MyException(String s)
	{
		super(s);
	}
}