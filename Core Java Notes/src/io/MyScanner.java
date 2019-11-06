package io;
import java.util.Scanner;
public class MyScanner
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number:");
	int x=s.nextInt();
	System.out.println("Enter second number:");
	int y=s.nextInt();
	int z=x+y;
	
	System.out.println("sum:"+z);

	
}
}
	