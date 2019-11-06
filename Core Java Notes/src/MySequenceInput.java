import java.io.*;

public class MySequenceInput
{
	
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		//FileNotFoundException
	SequenceInputStream sin=new SequenceInputStream(new FileInputStream("d:\\abhishek\\FirstFile.txt"),new FileInputStream("d:\\abhishek\\SecondFile.txt"));
	FileOutputStream fout=new FileOutputStream(new File("d:\\abhishek\\Copied.txt"));
	int b;
	while(true)
	{
		//IOException
		b=sin.read();
		if(b==-1)
		break;
		fout.write(b);
	}
	fout.close();
	System.out.println("Data Successfully Copied");
	
	}

}
