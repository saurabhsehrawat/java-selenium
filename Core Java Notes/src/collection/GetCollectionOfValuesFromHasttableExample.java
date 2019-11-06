package collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Collection;
public class GetCollectionOfValuesFromHasttableExample
{ 
  public static void main(String[] args)
  {
    //create Hashtable object
    Hashtable ht = new Hashtable();
    //add key value pairs to Hashtable
    ht.put("1","one");
    ht.put("2","two");
    ht.put("3","three");
    ht.put("4","four");  
    
    /*
      get Collection of values contained in Hashtable using
      Collection values() method of Hashtable class
    */ 
    Collection c = ht.values();
   
    System.out.println("Collection of Values created from Hashtable are :");
    //iterate through the collection
    Iterator itr = c.iterator();
    while(itr.hasNext())
      System.out.println(itr.next());  
    /*
       Please note that resultant Collection object is backed by the Hashtable.
       Any value that is removed from Collection will also be removed from
       original Hashtable object. 
    */
    //remove One from hashtable
    c.remove("one");
    //print values of original values of Hashtable
    System.out.println("Hashtable values after removal from Collection are :");
    Enumeration e = ht.elements();
    while(e.hasMoreElements())
      System.out.println(e.nextElement());
  }
}

