package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class HashSetDemo1
{
	public static void main(String args[])
    {
    HashSet h=new HashSet();
    h.add("A");
    h.add("Z");
    h.add("S");
    h.add("Y");
    h.add("B"); 
    h.add("E");
    System.out.println("Contents are "+h);
    
    
    Iterator ii=h.iterator();
    
    while(ii.hasNext())
    {
    	System.out.println(ii.next());
    }

//if you want data in same order

//Elements are stored in Insertion order in LinkedHashSet
    LinkedHashSet h1=new LinkedHashSet();
    h1.add("A");
    h1.add("Z");
    h1.add("S");
    h1.add("Y");
    System.out.println("Contents are "+h1);
    
Iterator i2=h1.iterator();
    
    while(i2.hasNext())
    {
    	System.out.println(i2.next());
    }

    // store the data in accending order....

    TreeSet t=new TreeSet();
    //t.add("A");
    //t.add("Z");
    //t.add("S");
    //t.add("Y");
    //t.add("B");
    
    //t.add(new Temp(5000));
    //t.add(new Temp(3000));
    //t.add(new Temp(1000));
    
    System.out.println("Contents are "+t);
    }
}
