package io;
import java.io.*;
public class MyPrintStreamSystem
{
public static void main(String args[])throws IOException
{
	PrintStream pout=new PrintStream(new FileOutputStream("c:\\abhi.doc"));
	
	System.setOut(pout);
	
	System.out.println("Con0sole pe nahi gaya data");
	System.out.println("data successfully sent to abhi.doc");
	
	
}
	
}
