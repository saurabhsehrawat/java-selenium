package collection;
import java.util.*;
public class ArrayListDemo1
{
	public static void main(String args[])
	{
		ArrayList al2=new ArrayList();
		
		int x[]={1,-1,2,-2,3,-3,4,-4};
		
		for(int i=0;i<x.length;i++)
		{
			al2.add(x[i]);
		}
		
		System.out.println("Elements of ArrayList: "+al2);
		
		Iterator it=al2.iterator();
		
		while(it.hasNext())
		{
			Integer z=(Integer)it.next();
			if(z.intValue()<0)
			it.remove();
		}
		System.out.println("Elements of ArrayList after removal of -ve Values: "+al2);
	}

}
