package Threads;

class ThreadFirst implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
}

class ThreadSecond implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class ThreadThird implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

public class RunThread2
{
	
	public static void main(String args[])
	{
		ThreadGroup tg=new ThreadGroup("my group");
		
		ThreadFirst tf=new ThreadFirst();
		Thread t1=new Thread(tg,tf,"First");
		t1.start();
		
		ThreadSecond ts=new ThreadSecond();
		Thread t2=new Thread(tg,ts,"Second");
		t2.start();
		
		ThreadThird tt=new ThreadThird();
		Thread t3=new Thread(tg,tt,"Third");
		t3.start();
		t3.setPriority(1000);
		
	}

}
