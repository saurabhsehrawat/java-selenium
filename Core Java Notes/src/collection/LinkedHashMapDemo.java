package collection;
import java.util.*;

public class LinkedHashMapDemo
{
	public static void main(String args[])
	{
		LinkedHashMap hm=new LinkedHashMap();
		System.out.println(hm.size());
		hm.put("1001", "abhishek");
		hm.put("1003", "naren");
		hm.put("1002", "sandeep");
		hm.put("1004", "priya");
		
		//Returns a Set view of the mappings contained in this map.
		//The set is backed by the map, so changes to the map are reflected in the set,
		//and vice-versa
		
		Set ss=hm.entrySet();
		Iterator ii=ss.iterator();
		while(ii.hasNext())
		{
			Map.Entry e=(Map.Entry)ii.next();
			String key=(String)e.getKey();
			String value=(String)e.getValue();		
			
			System.out.println(key+"="+value);
		}
	}
}
