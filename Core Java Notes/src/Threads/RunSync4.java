package Threads;
class Shared2
{
	int x;
	
	void show(String s,int a)
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
	void show1(String s,int a)
	{
		x=a;
		System.out.println("Starting of method show 1" + s +x);
		try
		{
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Ending of method show 1" + s+x);	
	}
}

class CustomThread4 extends Thread
{
	Shared2 s;
	public CustomThread4(Shared2 s,String str)
	{
	super(str);
	this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),10);
		s.show1(Thread.currentThread().getName(),100);
	}
}
class CustomThread5 extends Thread
{
	Shared2 s;
	public CustomThread5(Shared2 s,String str)
	{
	super(str);
	this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),20);
		s.show1(Thread.currentThread().getName(),200);
	}
}
class CustomThread6 extends Thread
{
	Shared2 s;
	public CustomThread6(Shared2 s,String str)
	{
	super(str);
	this.s=s;
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),30);
		s.show1(Thread.currentThread().getName(),300);
	}
}
public class RunSync4
{
public static void main(String s[]) throws InterruptedException
{
	Shared2 st=new Shared2();
	CustomThread4 t1=new CustomThread4(st,"One");
	CustomThread5 t2=new CustomThread5(st,"Two");
	CustomThread6 t3=new CustomThread6(st,"Three");
	t1.start();
	t2.start();
	t3.start();
}
}
