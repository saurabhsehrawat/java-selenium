import java.util.Scanner;

public class Calculator
{
	public static void main(String a[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Add, Subtract, Multiply, Divide any two numbers..");
	System.out.println("Enter first number..");
	int x=s.nextInt();
	System.out.println("Enter second number..");
	int y=s.nextInt();
	System.out.println("Addition is "+(x+y));
	System.out.println("Subtraction is "+(x-y));
	System.out.println("Multiplication is "+(x*y));
	System.out.println("Division is "+(x/y));
	System.out.println("Changes made for GIT");
	}
}