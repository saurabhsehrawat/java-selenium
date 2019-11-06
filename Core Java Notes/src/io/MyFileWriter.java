package io;
import java.io.*;

public class MyFileWriter
{
public static void main(String args[])
{
	String s="India is a good country";
	//FileOutputStream fin=new FileOutputStream("abhi.txt");
	try
	{
	//FileOutputStream fin=new FileOutputStream("String path",boolean append);
	FileOutputStream fin=new FileOutputStream("c:\\users\\abhi\\desktop\\abhi.doc",true);
	//BufferedOutputStream bout=new BufferedOutputStream(fin);
	byte bb[]=s.getBytes();

	fin.write(bb);
	System.out.println("File created and text added");
	
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("File not created");
	}
	
}
}
