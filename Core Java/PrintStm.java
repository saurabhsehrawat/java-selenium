import java.io.*;
class PrintStm
{
	public static void main(String a[]) throws FileNotFoundException
	{
		PrintStream ps=new PrintStream(new FileOutputStream("abc.txt"));
		System.setOut(ps);
		ps.println("Hello");
	}
}