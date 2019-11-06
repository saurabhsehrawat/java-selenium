package collection;
import java.util.*;

public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		System.out.println("Initial Size of Hashmap: "+hm.size());
		
		String s1="hello";
		String s2="hello";
		hm.put(s1,"abhishek");
		hm.put(s2, "Abhishek");
		hm.put("1003", "sandeep");
		hm.put("1004", "Naren");
		
		String re=(String)hm.get(s1);
		System.out.println(re);
		
		System.out.println(hm);
		//Returns a Set view of the mappings contained in this map.
		//The set is backed by the map, so changes to the map are
		//reflected in the set,
		//and vice-versa
		Set ss=hm.entrySet();
		System.out.println(ss);
		Iterator ii=ss.iterator();
		while(ii.hasNext())
		{
			//System.out.println(ii.next());
			Map.Entry e=(Map.Entry)ii.next();
			String key=(String)e.getKey();
			String value=(String)e.getValue();		
			System.out.println(key+"="+value);
		}
	}
}
