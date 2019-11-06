public class one_cls
{
	public static void main(String[] b)
	{
		System.out.println("Hello One...");
		two_cls tw=new two_cls();
		tw.main(10);
	}
}
class two_cls
{
	public static void main(int a)
	{
		System.out.println("Hello Two...");
	}
}
