package io;
import java.io.*;

public class MyDataReader
{
public static void main(String args[]) throws IOException
{ 	
	//int i;
	
	FileInputStream fin=new FileInputStream("c://users/abhi/desktop/abc1.txt");
	
	DataInputStream din=new DataInputStream(fin);
	//This method does not properly convert bytes to characters.
	//As of JDK 1.1, the preferred way to read lines of text is via the BufferedReader.readLine() method
	String s=din.readLine();
	//while((i=din.read())!=-1)
	System.out.println(s);
	
}
}
