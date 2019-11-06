package collection;

import java.util.*;

public class VectorDemo
{
	public static void main(String args[])
	{
		//Vector(int capacity, int increment)
		Vector vect=new Vector();
		System.out.println("Default capacity: "+ vect.capacity());
		
		Vector vec=new Vector(4,10);
		System.out.println("initial capacity "+ vec.capacity());
		System.out.println(vec.size());
		vec.addElement("a");
		vec.addElement("b");
		vec.addElement("a");
		vec.addElement("b");
		vec.add(10);
		
		System.out.println("Capacity after increment: "+ vec.capacity());
		System.out.println(vec.size());
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
		System.out.println(vec.contains(10));
		
		Enumeration e=vec.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		Iterator ii=vec.iterator();
		System.out.println("We can also iterate by Iterator");
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
	}

}
