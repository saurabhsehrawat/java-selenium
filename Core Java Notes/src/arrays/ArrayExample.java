package arrays;

public class ArrayExample
{
	public static void main(String args[])
	{
		int[] percentage;
		percentage=new int[30];
		
		percentage[0]=99;
		
		
		String[] daysOfWeek={"Monday","Tuesday", "Wednesday","Thrusday","Friday","Saturday"};
		
		System.out.println(percentage[0]);
		System.out.println(daysOfWeek[1]);
		
		for(String s:daysOfWeek)
		{
			System.out.println(s);
		}
		
		
		
	}

}
