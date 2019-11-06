package io;
import java.io.*;
public class MyBufferedOutputStream
{
	public static void main(String args[])
	{
	String s="India is a good country";
	try
	{
	FileOutputStream fout=new FileOutputStream("c://users/abhi/desktop/buffer.txt");
	//BufferedOutputStream(The default buffer size of 2048 bytes);
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	
	byte b[]=s.getBytes();
	bout.write(b);
	//bout.flush();
	bout.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("File created sucessfully");	
}
}
