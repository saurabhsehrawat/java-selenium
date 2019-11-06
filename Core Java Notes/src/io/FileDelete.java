package io;

import java.io.File;
 
public class FileDelete
{
    public static void main(String[] args)
    {	
    	try
    	{
    		File file = new File("c:\\abhi.doc");
    		
    		if(file.delete())
    		{
    			System.out.println(file.getName() + " is deleted!");
    		}else
    		{
    			System.out.println("Delete operation is failed.");
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
 
    }
}