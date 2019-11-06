package exceptions;

public class CustomException
{
int age;
void get(int age) throws MyException
{
	if(age<18)
	{
		throw new MyException("Invalid Age");
	}
	else
	{
		this.age=age;
	}
}

public static void main(String s[])
{
	CustomException t1=new CustomException();
	try{
	t1.get(15);
	}
	catch(MyException me)
	{
		System.out.println(me);
	}	
}
	
	
}
