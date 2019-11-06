package stringhandling;

public class InsertStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("I Java");
		//insert(int position, String str)
		sb.insert(2,"love ");
		System.out.println(sb);
	}

}
