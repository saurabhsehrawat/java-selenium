import java.io.*;
class DataOtpt
{
	public static void main(String a[]) throws FileNotFoundException, IOException
	{
		String s="Hi How are You???";
		FileOutputStream fs=new FileOutputStream("abc.txt");
		DataOutputStream ds=new DataOutputStream(fs);
		ds.writeChars(s);
		System.out.println("Done..");
	}
}