package stringhandling;

public class Demo2
{
public static void main(String args[])
{	
	char ch[]={'a','b','c','d','e'};
	
	String sb1=new String(ch);
	System.out.println(sb1);
	
	//(int position, int no. of chars)
	String sb=new String(ch,2,3);
	System.out.println(sb);
	
	
	byte bb[]={65,66,67,68};
	String b1=new String(bb);
	System.out.println(b1);
	
	//(int position,int no. of chars)
	String b2=new String(bb,0,3);
	System.out.println(b2);
	
}
}
