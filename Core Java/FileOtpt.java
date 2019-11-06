import java.io.*;

public class FileOtpt
{
	public static void main(String[] a) throws FileNotFoundException, IOException
	{
		String s="My name is Saurabh...";
		try{
		FileOutputStream f=new FileOutputStream("abc.txt",true);//creates file at same location where java file is located,
		byte[] b=s.getBytes();
		f.write(b);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found...");
		}
		
		//true means we can append to this file
		
	}
}