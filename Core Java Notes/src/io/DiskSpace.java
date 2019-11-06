package io;
import java.io.File;
public class DiskSpace
{
    public static void main(String[] args)
    {	
    	File file = new File("d:");
    	
    	//total disk space in bytes.
    	long totalSpace = file.getTotalSpace(); 
    	///unallocated / free disk space in bytes.
    	long usableSpace = file.getUsableSpace();
    	//unallocated / free disk space in bytes.
    	long freeSpace = file.getFreeSpace(); 
    	
    	System.out.println(" === Partition Detail ===");
    	System.out.println(" === Size in bytes ===");
    	System.out.println("Total size : " + totalSpace + " bytes");
    	System.out.println("Usable Space : " + usableSpace + " bytes");
    	System.out.println("Space free : " + freeSpace + " bytes");
 
    	System.out.println(" === Size in Mega bytes ===");
    	System.out.println("Total size : " + totalSpace /1024 /1024 + " mb");
    	System.out.println("Usable Space : " + usableSpace /1024 /1024 + " mb");
    	System.out.println("Free Space : " + freeSpace /1024 /1024 + " mb");
    }
}