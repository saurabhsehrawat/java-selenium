package design_pattern;
public class SingletonPattern
{
private static SingletonPattern single;

	private SingletonPattern()
	{
	}
	public static SingletonPattern getSingleInstance()
	{
		if(single==null)
		{
			synchronized(SingletonPattern.class)
			{
				if(single==null)
				{
				single=new SingletonPattern();
				}
			}
		}
	return single;
	}
public static void main(String args[])
{
System.out.println("The output of two instances");
System.out.println("======================");
SingletonPattern sp=new SingletonPattern();
System.out.println("Output from first instance:"+sp.getSingleInstance());
SingletonPattern sp1=new SingletonPattern();
System.out.println("Output from second instance"+sp1.getSingleInstance());



}
}



