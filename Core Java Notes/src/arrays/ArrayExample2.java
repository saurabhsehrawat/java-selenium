package arrays;

public class ArrayExample2
{
	public static void main(String[] args)
	{
	int[] array={1,2,3};
	
	int[][] doub={
			array,
			{4,5,6},
			{6,7}
			};
	System.out.println(doub[0][0]);
	System.out.println(doub[1][1]);
	System.out.println(doub[2][1]);
	
	int[][] xx=new int[2][3];
	xx[0][1]=12;
	
	System.out.println(xx[0][1]);
	
	
	
String[][] stringArray=new String[2][2];
stringArray[0][0]="zero per zero";
stringArray[0][1]="zero per one";
stringArray[1][0]="one per zero";
stringArray[1][1]="one per one";

System.out.println(stringArray[0][0]);
System.out.println(stringArray[0][1]);
System.out.println(stringArray[1][0]);
System.out.println(stringArray[1][1]);
System.out.println("");
System.out.println("Access Array via loop");
System.out.println("");
for(int i=0;i<stringArray.length;i++)
{
	for(int j=0;j<stringArray.length;j++)
	{
		System.out.println(stringArray[i][j]+" ");
	}
	System.out.println(" ");
}

	}
}
