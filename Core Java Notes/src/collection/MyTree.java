package collection;

import java.util.*;
public class MyTree
{
	public static void main(String args[])
	{
		Comparator m=new MyComp();
		TreeSet t=new TreeSet(m);
		t.add(new Temp(2000));
		t.add(new Temp(3000));
		t.add(new Temp(1000));
		t.add(new Temp(7000));
		
		Iterator it=t.iterator();
		while(it.hasNext())
		{
			Temp t1=(Temp)it.next();
			System.out.println(t1.salary);
		}
		
	}

}
