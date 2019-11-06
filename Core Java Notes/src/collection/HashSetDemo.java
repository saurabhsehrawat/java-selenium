package collection;
import java.util.*;
public class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet hl=new HashSet();
		System.out.println(hl.size());
		
		hl.add("Ajay");
		hl.add("Vijay");
		hl.add("Ram");
		hl.add("Pramod");
		hl.add("Ganesh");
		hl.add(10);
		
		System.out.println(hl.size());	
		System.out.println(hl);
		Iterator itr=hl.iterator();
		  while(itr.hasNext()){
		   System.out.println(itr.next());
		  }
		
	}

}
