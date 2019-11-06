package stringhandling;

public class DeleteStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("i love java");
		System.out.println(sb);
		//sb.delete(start, end)
		sb.delete(2,6);
		System.out.println(sb);	
	}
}
