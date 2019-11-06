package io;
import java.io.*;
public class MyBufferedReader
{
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		System.out.println("This is what you have typed: "+st);
		
		//byte bb[]=st.getBytes();
		//FileOutputStream fout=new FileOutputStream("c:\\buffertest.txt");
		//fout.write(bb);
		FileWriter rw=new FileWriter("c:\\buffertoast.txt");
		rw.write(st);
		rw.close();
	
	}

}
