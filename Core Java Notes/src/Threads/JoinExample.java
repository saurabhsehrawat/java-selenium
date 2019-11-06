package Threads;

class JoinExample extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
System.out.println("i value is:"+i);
}

public static void main(String[] args) throws Exception
{
JoinExample jt=new JoinExample();//child thread
jt.start();
jt.join();//main thread is waiting for child thread joining

int x=11;
int y=22;
int z=x+y;
System.out.println("sum is:"+z);
System.out.println("main method completed");
}
}

 