class Shared
{
	int x;
	void show(String s, int a)
	{
		x=a;
		System.out.println("Starting of method: "+s+""+x);
		
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Ending of method: "+s+x);
	}
	void show1(String s, int a)
	{
		x=a;
		System.out.println("Starting of method show1: "+s+""+x);
		
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Ending of method show1: "+s+x);
	}
	
}

class CustomThread1 extends Thread
{
	Shared s;
	CustomThread1(Shared s,String str)
	{
		super(str);
		this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),10);
		s.show1(Thread.currentThread().getName(), 10);
	}
}
class CustomThread2 extends Thread
{
	Shared s;
	CustomThread2(Shared s,String str)
	{
		super(str);
		this.s=s;
	}
	
	public void run()
	{
		s.show(Thread.currentThread().getName(),20);
		s.show1(Thread.currentThread().getName(),20);
	}
}
class CustomThread3 extends Thread
{
	Shared s;
	CustomThread3(Shared s,String str)
	{
		super(str);
		this.s=s;
	}
	
	public void run()
	{
		s.show(Thread.currentThread().getName(),30);
		s.show1(Thread.currentThread().getName(),30);
	}
}
public class RunSync
{
	public static void main(String args[])
	{
		Shared st=new Shared();
		
		CustomThread1 t1=new CustomThread1(st,"First");
		CustomThread2 t2=new CustomThread2(st,"Second");
		CustomThread3 t3=new CustomThread3(st,"Third");
		
		t1.start();
		t1.setPriority(6);
		t2.start();
		t3.start();
	}

}
