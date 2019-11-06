package io;
import java.io.*;
public class MyPrintStreamSystemErr
{
public static void main(String args[]) throws IOException
{
	PrintStream pout=new PrintStream(new FileOutputStream("c:\\err.doc"));
	System.setErr(pout);
	System.err.println("Err se bheja hai data");
}
}
