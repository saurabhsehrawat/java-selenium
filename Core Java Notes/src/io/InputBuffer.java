package io;

import java.io.*;
public class InputBuffer
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader inr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inr);
		
		int i=0;
		
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
	}
}
