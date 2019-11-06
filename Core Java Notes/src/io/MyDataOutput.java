package io;
import java.io.*;

public class MyDataOutput
{
public static void main(String args[]) throws IOException
{	
	String s="DataOutputStream Test";
	
	FileOutputStream fout=new FileOutputStream("c://users/abhi/desktop/abc1.txt");
	DataOutputStream dout=new DataOutputStream(fout);
	
	dout.writeChars(s);
	System.out.println("Done");
	
	
	
}
}
