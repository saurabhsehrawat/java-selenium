package collection;
import java.util.*;
public class Test
{
	public static void main(String args[])
	{
		Vector al=new Vector(3,5);
		
		al.add(2.4);
		al.add(3.2);
		al.add(5.3);
		System.out.println(al);
		System.out.println("Capacity: "+al.capacity());
		System.out.println("Size of Vector:"+al.size());
	
		Iterator ii=al.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
	}

}
