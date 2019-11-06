import java.io.*;
public class Experi
{
	public static void main(String args[])
	{
		try
		{
		FileInputStream fin=new FileInputStream(new File("d:\\Wallpapers\\Arnold.jpg"));
		FileOutputStream out=new FileOutputStream(new File("c:\\abhishek\\abc.jpg"));
		
		
		int b=fin.read();
		//byte ft[]=
		while(fin.read()!=-1)
		{
			out.write(b);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	

}
