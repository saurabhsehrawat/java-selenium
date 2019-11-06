package Threads;

public class MyShutDownHooks
{
	public static void main(String args[])
	{
		Runtime rt=Runtime.getRuntime();
		rt.addShutdownHook(new ToHook());
		System.out.println("End of Main method");
		System.exit(0);	
		
	}

}
class ToHook extends Thread
{
	public void run()
	{
		System.out.println("System is cleaning up");
	}
}
