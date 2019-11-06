package Threads;
class Shared
{
	 int x;
	synchronized void show(String s,int a)
	{
		x=a;
		System.out.println("Starting of method" + s +x);
		try
		{
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Ending of method" + s+x);	
	}
}

class CustomThread extends Thread
{
	Shared s;
	public CustomThread(Shared s,String str)
	{
	super(str);
	this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),10);
	}
}
class CustomThread2 extends Thread
{
	Shared s;
	public CustomThread2(Shared s,String str)
	{
	super(str);
	this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),20);
	}
}
class CustomThread3 extends Thread
{
	Shared s;
	public CustomThread3(Shared s,String str)
	{
	super(str);
	this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),30);
	}
}
public class RunSync
{
public static void main(String s[]) throws InterruptedException
{
	Shared st=new Shared();
	CustomThread t1=new CustomThread(st,"One");
	CustomThread2 t2=new CustomThread2(st,"Two");
	CustomThread3 t3=new CustomThread3(st,"Three");
	t1.start();
	t2.start();
	t3.start();
}
}
