package collection;
import java.io.*;
import java.util.*;
public class MyProperties
{
	public static void loadProperties()
	{
	Properties loadProps=new Properties();
	
	FileInputStream fi=null;
	try
	{
		fi=new FileInputStream("application.properties");
		loadProps.load(fi);
		
		loadProps.put("1005", "suresh");
		Enumeration names=loadProps.propertyNames();
		while(names.hasMoreElements())
		{
			String key=(String)names.nextElement();
			String value=loadProps.getProperty(key);
			System.out.println(key+"="+value);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public static void main(String args[])
	{
	loadProperties();
	}

}
