public class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Thread T2 started...."+i);
		}
	}
	
public static void main(String[] a)
{
	MyThread1 t1=new MyThread1();
	Thread t=new Thread(t1);
	t.start();
}
}