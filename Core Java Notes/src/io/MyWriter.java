package io;
import java.io.*;
public class MyWriter
{
	public static void main(String args[]) throws IOException
	{
		String ss="India is a massstttt country";
		FileOutputStream fout=new FileOutputStream("c:\\users\\abhi\\desktop\\abhi.txt",true);
		byte bb[]=ss.getBytes();
		fout.write(bb);
		System.out.println("Data Successfully Sent");
	}

}
