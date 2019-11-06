package Threads;

public class SetDaemon implements Runnable
{

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException
    {
        //Create a thread as a daemon thread
    	Thread th = new Thread(new SetDaemon(),"First");
        th.setDaemon(true);
        th.start();
        Thread th1 = new Thread(new SetDaemon(),"Second");
        th1.start();
        
        
        System.out.println("Active threads = " + Thread.activeCount());
        th.join();
        th1.join();
    }
}


