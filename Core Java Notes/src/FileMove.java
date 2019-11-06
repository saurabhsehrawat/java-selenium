import java.io.*;
public class FileMove
{
	public static void main(String args[])
	{
		try
		{
		File ff=new File("d:\\move\\moveit.txt");
		
		if(ff.renameTo(new File("e:\\here\\" + ff.getName())))
		{
			System.out.println("File moved successfulyy");
		}
		else
		{
			System.out.println("Failed to move file");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
