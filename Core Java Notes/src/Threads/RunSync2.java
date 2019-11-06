package Threads;

class MyShared
{
	int flag=0;
	int data=0;
	
	synchronized public void submit()
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
		notify();
	}
	synchronized int withdraw()
	{
		if(flag==0)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+": "+"Wait Block");
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		return data;
		}	
	}



class FirstThread extends Thread
{
	MyShared s;
	FirstThread(MyShared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
public void run()
{
	System.out.println(Thread.currentThread().getName() +": "+s.withdraw());
}
}
class SecondThread extends Thread
{
	MyShared s;
	SecondThread(MyShared s,String str)
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

public class RunSync2
{
	public static void main(String args[])
	{
	MyShared stt=new MyShared();
	FirstThread ft=new FirstThread(stt,"First");
	
	SecondThread st=new SecondThread(stt,"Second");
		
	}

}
