import java.io.IOException;

public class ExecuteProcess
{
public static void main(String args[]) throws IOException
{
	
	Runtime rt=Runtime.getRuntime();
	
	rt.exec("notepad.exe");
	rt.exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	System.out.println(rt.availableProcessors());
	System.out.println(rt.maxMemory());
	System.out.println(rt.totalMemory());
	System.out.println(rt.freeMemory());
	
}
}
