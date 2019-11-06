package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class MySequenceInput 
{
	public static void main(String[] args)throws IOException
	{
		SequenceInputStream in=new SequenceInputStream(new FileInputStream("c:\\abhishek\\abhishek.txt"),new FileInputStream("c:\\abhishek\\doosrifile.txt"));
		FileOutputStream out= new FileOutputStream("c:\\abhishek\\Copied.txt");
		int b;
		while(true)
		{
			b=in.read();
			if(b==-1)
			{
			break;
			}
			out.write(b);	
		}
	System.out.println("file successfully copied");
	}

}
