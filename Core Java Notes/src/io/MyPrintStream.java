package io;
import java.io.*;

public class MyPrintStream
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("c:\\test.txt",true);
		
		PrintStream ps=new PrintStream(fout);
		
		ps.println("Hiiiiiiiiii");
		ps.println("Hello hows you");
		ps.println("Damn");
		ps.println("Done");
	
	}

}
