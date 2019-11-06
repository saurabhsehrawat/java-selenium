package io;
import java.io.*;
public class ChartoBtye
{
	public static void main(String args[]) throws IOException
	{
		PrintStream pr=new PrintStream(new FileOutputStream("system.txt"));
		BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str=bin.readLine();
			byte bb[]=str.getBytes();
			pr.write(bb);
		}
	}
	

}
