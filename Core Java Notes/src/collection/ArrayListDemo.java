package collection;
import java.util.*;

public class ArrayListDemo
{
public static void main(String args[])
{
	ArrayList al=new ArrayList();
	System.out.println(al.size());
	
	al.add("d");
	al.add("b");
	al.add("a");
	al.add("b");
	al.add(10);
	al.add("z");
	
	System.out.println("Size of ArrayList: "+al.size());
	al.remove(2);
	System.out.println("Size of ArrayList after removal of Element: "+al.size());
	System.out.println(al);
	
	Iterator ii=al.iterator();
	
	while(ii.hasNext())
	{
		//al.add("abhishek");
		System.out.println(ii.next());
	}
	System.out.println(al);
	
}
}