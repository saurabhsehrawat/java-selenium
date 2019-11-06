import java.io.*;
class BfrdOtpt
{
public static void main(String sr[])
	{
		BufferedOutputStream bs=null;//keeping null not mandatory
		String s="Hope you are good....";
		try
		{
		FileOutputStream fo=new FileOutputStream("abc.txt");
		bs=new BufferedOutputStream(fo);
		byte[] b=s.getBytes();
		bs.write(b);
		bs.close();//mandatory to close
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("File created successfully....");
	}

}