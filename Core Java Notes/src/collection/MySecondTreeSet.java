package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class MySecondTreeSet
{
	public static void main(String args[])
	{
		TreeSet tree=new TreeSet();
		//tree.add("a");
		//tree.add("d");
		//tree.add("z");
		//tree.add("s");
		
		tree.add(new Temp(1000));
		tree.add(new Temp(2000));
		tree.add(new Temp(7000));
		tree.add(new Temp(1500));
		
		Iterator ii=tree.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
	}

}
