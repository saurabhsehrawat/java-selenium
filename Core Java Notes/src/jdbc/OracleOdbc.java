package jdbc;
import java.sql.*;

public class OracleOdbc
{
	
	public static void main(String args[])
	{	try
	{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
		if(con==null)
		{
			System.out.println("connection not established");
		}
		else
		{
			System.out.println("connection established");
		}
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getMaxColumnNameLength());
		boolean isBatchingSupported = dbmd.supportsBatchUpdates();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverVersion());
	
		System.out.println("Batching Supported = " + isBatchingSupported);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
