package collection;
import java.util.Arrays;

public class SortIntArrayExample
{
	public static void main(String[] args)
	{
		   
	    //create an int array
	    int[] i1 = new int[]{3,2,5,4,1};
	   
	    //print original int array
	    System.out.print("Original Array : ");
	    for(int index=0; index < i1.length ; index++)
	      System.out.print("  "  + i1[index]);
	   
	    
	    //To sort full array use sort(int[] i) method.
	    Arrays.sort(i1);
	   
	    //print sorted int array
	    System.out.print("Sorted int array : ");
	    for(int index=0; index < i1.length ; index++)
	      System.out.print("  " + i1[index]);
	     
	   
	   
	    int[] i2 = new int[]{5,2,3,1,4};
	    
	    //sort(int[] a, int fromIndex, int toIndex)

	    Arrays.sort(i2,1,4);
	   
	    //print sorted int array
	    System.out.print("Partially Sorted int array : ");
	    for(int index=0; index < i2.length ; index++)
	      System.out.print("  "  + i2[index]);
	}
}
