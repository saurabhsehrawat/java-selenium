import java.io.*;
class SequenceStm
{
	public static void main(String a[]) throws IOException
	{
		SequenceInputStream s=new SequenceInputStream(new FileInputStream("abc.txt"),new FileInputStream("xyz.txt"));
		FileOutputStream f=new FileOutputStream("F:\\Java\\copied.txt");
		//Create a new txt file now and copy data to it
		int b;
		while(true)
		{
			b=s.read();
			if(b==-1)
			{
				break;
			}
			else
			{
				f.write(b);
			}
			//f.close();
		}
		System.out.println("Copied....");
			
	}
}