import java.util.*;
public class LinkedHashSetDemo
{
	
	public static void main(String args[])
	{
		//insert elements in insertion order
		LinkedHashSet lhs=new LinkedHashSet();
		
		System.out.println(lhs.size());
		lhs.add("a");
		lhs.add("a");
		lhs.add("d");
		lhs.add("b");
		lhs.add("d");
		lhs.add("z");
		lhs.add("s");
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		
	}

}
