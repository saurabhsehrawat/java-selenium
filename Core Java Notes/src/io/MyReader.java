package io;
import java.io.*;
public class MyReader
{
public static void main(String args[])throws IOException
{	
	int i=0;
	FileInputStream fin=new FileInputStream("c:\\users\\abhi\\desktop\\abhi.doc");
	//System.setIn(fin);
	//while((i=System.in.read())!=-1)
	while((i=fin.read())!= -1)
	//i=fin.read();
	System.out.print(i);	
}
}
