package stringhandling;

public class StringByteArrayCons
{
	public static void main(String args[])
	{
		byte bb[]={65,66,67,68};
		
		//String ss=new String(byte bb[])
		String s1=new String(bb);
		System.out.println(s1);
		
		//String(byte[] bytes, int position, int no. of chars)
		String s2=new String(bb,2,2);
		System.out.println(s2);
		
		
	}

}
