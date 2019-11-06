package io;
import java.io.*;
public class MyStreamTokenizer
{
	public static void main(String args[]) throws IOException
	{
		int wordCount=0;
		int number=0;
		StreamTokenizer token = new StreamTokenizer(new FileReader("abhi.txt"));
		while(token.nextToken() != StreamTokenizer.TT_EOF)
		{
	    if(token.ttype == StreamTokenizer.TT_WORD)
	    wordCount++;
	    else if(token.ttype == StreamTokenizer.TT_NUMBER)
	    number++;
	    }
		System.out.println(wordCount);
		System.out.println(number);
}
}
