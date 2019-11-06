public class ClassLoaderEx
{
	public static void main(String args[])
	{
		Class c=ClassLoaderEx.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}
}