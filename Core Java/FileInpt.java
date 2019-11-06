import java.io.*;
public class FileInpt
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		int i=0;
		FileInputStream f=new FileInputStream("abc.txt");
		System.setIn(f);
		while((i=f.read())!=-1)//-1 till end of file
		{
			System.err.print((char)i);//downcasting from int to char
			//err is used instead out, both are same, just err is used in source code to identify we are printing error msg
		}
	}
}