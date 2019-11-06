package collection;
import java.util.*;

public class HeadMapMethod
{
        public static void main(String args[])
        {
        		TreeMap tmap = new TreeMap();
                tmap.put(1, "Abhishek");
                tmap.put(3, "Naren");
                tmap.put(4, "Priya");
                tmap.put(2, "Manmeet");
                tmap.put(6, "Luvkesh");
                
                SortedMap map = tmap.headMap(3);
                // Returns a view of the portion of this sorted map whose keys are strictly
                //less than toKey.
                System.out.println("The Map elements are as : " + tmap);
                System.out.println("The head map is as : " + map);
                
                SortedMap sm2=tmap.tailMap(3);
                //Returns a view of the portion of this sorted map whose keys are greater
                //than or equal to fromKey.
                System.out.println("The elements of Tail Map are:"+sm2);
                
                SortedMap sm3=tmap.subMap(1,4);
                //Returns a view of the portion of this sorted map whose keys range from fromKey
                //, inclusive, to toKey, exclusive.
                
                System.out.println("The elements of sub map are: "+sm3);
                
        }
}