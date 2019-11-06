package collection;
import java.util.Calendar;

public class CalenderDemo
{

    public static void main(String argss[])
    {
    	try
    	{	
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.get(Calendar.DATE)+ "/" +cal.get(Calendar.MONTH) +"/"+cal.get(Calendar.YEAR)); 
    	}
    	catch(Exception e)
    	{
    		
    	}
    }

}
