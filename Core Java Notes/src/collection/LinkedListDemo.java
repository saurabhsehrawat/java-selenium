package collection;
import java.util.*;

public class LinkedListDemo 
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add(10);
		
		System.out.println("Element at zero index: "+ll.get(0));
		System.out.println("Content of ll:"+ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		System.out.println("Removed:"+ ll.removeFirst());
	
		ListIterator it=ll.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Now previous");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}	
	}
}
