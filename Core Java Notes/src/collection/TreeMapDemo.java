package collection;

import java.util.*;

public class TreeMapDemo 
{
public static void main(String args[])
{
      	TreeMap tm=new TreeMap();
        tm.put("India", 28);
        tm.put("Sri Lanka", 30);
        tm.put("Pakistan", 28);
        tm.put("USA", 4);
        tm.put("UK", 2);
      
        System.out.println(tm);
        
        Set s=tm.entrySet();  
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry me=(Map.Entry)i.next();
            System.out.println("Key is "+me.getKey()+"  value is "+me.getValue());
        }

}
}

