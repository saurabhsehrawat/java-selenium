package io;
import java.io.*;
public class MyBufferedWriter
{
	public static void main(String args[]) throws IOException
	{
		String content = "This is the text tobe write into File";
		 
		File file = new File("c:\\Bufferwriter.txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		//if we call flush after close than it will throw IOException
		//bw.flush();

		System.out.println("Done");
	
	}

}
