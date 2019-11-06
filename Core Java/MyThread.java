public class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread T2 started.,,,,,,,");
	}
	
public static void main(String[] args)
	{
		MyThread t1=new MyThread();
		t1.start();//start method comes from Thread class, start will call run()	
	}
}