package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTemp
{
	public static void main(String args[])
	{
		HashMap ht=new HashMap();
		ht.put(1,new Temp(1000));
		ht.put(2,new Temp(3000));
		
		/*
		 * Returns a Set view of the mappings
		 *  contained in this map. 
		 *  The set is backed by the map,
		 *   so changes to the map are
		 *    reflected in the set, and vice-versa.
		 */
		Set it=ht.entrySet();
		Iterator ii=it.iterator();
		while(ii.hasNext())
		{
			Map.Entry e=(Map.Entry)ii.next();
			String key=(String)e.getKey();
			String value=(String)e.getValue();		
			
			System.out.println(key+"="+value);
		}
		
	}

}
