package stringhandling;
public class Temp
{public static void main(String[] args)
	{
		
		String s1="Hello";
		String s2=new String("hello");
		
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
		/*
		byte b[]={65,66,67};
		String s=new String(b);
		System.out.println(s);
		*/
	/*	
	String concatenation
	*/
	/*
	String s="Good";
	s=s+"morning";
	System.out.println(s);
	
	String s1="age";
	s1=s1+10;
	System.out.println(s1);
	*/
	
	
	
	
		//String s1=10+20+"Ramu is"+30+40+"good"+50+60+70+"boy";
		//String s2=s1+"shaamu";
		//System.out.println(s1);
		/*
		
		int x=10;
		String s2=new Integer(x).toString();
		System.out.println(s2);
		String s1="Ramu is a ";
		String s3=s1.concat("Good boy ").concat(" and he is ").concat(" mad ").concat(" about cars ");
		System.out.println(s3);
		*/
		
		/*
		Temp t1=new Temp();
		Temp t2=new Temp();
		
		boolean b=t1.equals(t2);
		System.out.println(b);
		*/

		/*
		String s="Hello";
		//String s2="Hello";
		String s3=new String("HELLO");
		//checks by content not by ref. ID
		boolean b=s.equalsIgnoreCase(s3);
		System.out.println(b);	
		*/
		//By Compareto() method, checks in chronological order
		/*
		String s1="A";
		String s2=new String("B");
		
		int x=s2.compareTo(s1);
		System.out.println(x);
		*/	
	
	String s="Hello india is a good country";	
	for(int i=0;i<=s.length();i++)
	{
	char ch=s.charAt(i);
	System.out.println(ch);	
	}
		
	//Sub String functions
	
	//String s="India is a good country";
	//subString(int begin index,int end index)
	//String s2=s.substring(0,6);
	//String s2=s.trim();
	//System.out.println(s2);
	
	
	//Index of
	
	//String s3="India Is a good coiiiiiuntry";
	//index(int string,int from index)
	//int z=s3.indexOf("I",4);
	//System.out.println(z);
	//System.out.println("hello".length());
	}

}
