package collection;

//Get lowest and highest key stored in Java TreeMap example
import java.util.TreeMap;
 
public class GetLowestHighestKeyTreeMapExample {
 
  public static void main(String[] args) {
 
    //create TreeMap object
    TreeMap treeMap = new TreeMap();
   
    //add key value pairs to TreeMap
    treeMap.put("1","one");
    treeMap.put("9","Three");
    treeMap.put("2","Two");
    treeMap.put("5","Five");
    treeMap.put("4","Four");
    System.out.println(treeMap);
    
    
    System.out.println("Lowest key Stored in Java TreeMap is : "
                                                 + treeMap.firstKey());
   
       
    System.out.println("Highest key Stored in Java TreeMap is : "
                                                   + treeMap.lastKey());
 
  }
}
 
