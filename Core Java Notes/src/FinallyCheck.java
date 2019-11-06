
public class FinallyCheck
{
	void show()
	{
		try
		{
			int x=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(0);
		}
		
		finally
		{
			System.out.println("hello");
		}
	}
	public static void main(String args[])
	{
		FinallyCheck fc=new FinallyCheck();
		fc.show();
	}

}
