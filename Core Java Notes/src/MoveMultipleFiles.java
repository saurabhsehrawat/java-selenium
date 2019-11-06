import java.io.*;
public class MoveMultipleFiles
{
	
	public static void main(String args[])
	{
	File directory=new File("d:\\move\\");
	File files[]=directory.listFiles();
	
	System.out.println("List of files to be moved:");
	for(int i=0;i<files.length;i++)
	{
	System.out.println(files[i].getName());
	try
	{
	if(files[i].renameTo(new File("e:\\here\\"+files[i].getName())))
	{
		System.out.println("File moved successfully");
	}
	else
	{
		System.out.println("Move operation failed");
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	}

}
