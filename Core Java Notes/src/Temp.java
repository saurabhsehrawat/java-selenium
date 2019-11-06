import java.io.IOException;

public class Temp
{
public static void main(String[] args) throws IOException
{
	Runtime rt=Runtime.getRuntime();
	rt.exec("notepad.exe");
	System.out.println(rt.freeMemory());
	System.out.println(rt.totalMemory());
	System.out.println(rt.maxMemory());
}	
}
