package ThreadInterrupt;

class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
	}
	public void run()
	{
		System.out.println(getName());
		try
		{
			Thread.sleep(6000*100);
		}
		catch(Exception e)
		{
			System.out.println("Interupted Forcely " +e);
			
		}
		
		System.out.println(getName()+" is Dead");
	}
}

class Thread2 extends Thread
{
	Thread1 t1;
	
	Thread2(String str,Thread1 t1)
	{
		super(str);
		this.t1=t1;
	}
	public void run()
	{
		System.out.println(getName());
		t1.interrupt();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(getName()+" is Dead");
	}	
}

public class Interupt
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1("First");
		t1.setPriority(10);
		Thread2 t2=new Thread2("Second",t1);
		t1.start();
		t2.start();
	}
}
