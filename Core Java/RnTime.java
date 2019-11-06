public class RnTime
{
	public static void main(String[] a)
	{
		Runtime rt=Runtime.getRuntime();
		try
		{
		rt.exec("Notepad.exe");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(rt.availableProcessors());
		System.out.println(rt.freeMemory());
	}
}