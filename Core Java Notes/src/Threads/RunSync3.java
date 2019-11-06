package Threads;

class MyShared1
{
	int flag=0;
	int data=0;
	
	synchronized void submit()
	{
		flag=1;
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		data=10;
		System.out.println(Thread.currentThread().getName()+": "+"Values submitted");
		Thread.currentThread().resume();
	}
	synchronized int withdraw()
	{
		if(flag==0)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+": "+"Wait Block");
				Thread.currentThread().suspend();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		return data;
		}	
	}



class FirstThread1 extends Thread
{
	MyShared1 s;
	FirstThread1(MyShared1 s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
public void run()
{
	System.out.println(Thread.currentThread().getName() +": "+ s.withdraw());
}
}
class SecondThread2 extends Thread
{
	MyShared1 s;
	SecondThread2(MyShared1 s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		s.submit();
	}
	
}

public class RunSync3
{
	public static void main(String args[])
	{
	MyShared1 stt=new MyShared1();
	FirstThread1 ft=new FirstThread1(stt,"First");
	
	SecondThread2 st=new SecondThread2(stt,"Second");
		
	}

}
