package io;

import java.io.*;

public class MyFileReader
{
	public static void main(String args[])
	{
		try
		{
		FileReader fr=new FileReader("buffer.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		
		//String s=bfr.readLine();
		System.out.println(bfr.readLine());
		}
		catch(Exception e)
		{
			
		}
		
	}

}
