package stringhandling;

class Demo
{
	public static void main(String args[])
	{
		String s="Good morning";
		//char ch=s.charAt(9);
		//System.out.println(ch);
		
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			System.out.println(ch1);
		}
	}
}