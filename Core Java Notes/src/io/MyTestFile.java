package io;
import java.io.*;
public class MyTestFile
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Test It.");
		File file = new File("d:\\Arun");
		String fileNames[] = file.list();
		for(int i=0;i<fileNames.length;i++)
		{
			System.out.println(fileNames[i]);	
		}
		File createFile = new File("e:\\Arun");
		createFile.mkdir();
		// read each file and write to the destination directory one by one
		//while()
		
		
	}
}