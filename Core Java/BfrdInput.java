import java.io.*;
class BfrdInput
{
public static void main(String a[]) throws FileNotFoundException, IOException
{
	FileInputStream f=new FileInputStream("copied.txt");
	BufferedInputStream bis=new BufferedInputStream(f);
	while(bis.available()>0)
	{
		System.out.println((char)bis.read());
	}
}
}