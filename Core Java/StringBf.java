public class StringBf extends Object

{
	public static void main(String a[])
	{
		StringBuffer s=new StringBuffer("I am good boy");
		s.replace(2,4,"was");//startindex,endindex,string
		System.out.println(s);
		System.out.println(s.reverse());
		s.append(" before 4 years");
		System.out.println(s);
	}
}