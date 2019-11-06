package jdbc;
import java.sql.*;
public class Dbmd
{
	public static void main(String args[])
	{
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//Connection con=DriverManager.getConnection("jdbc:odbc:student");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
			DatabaseMetaData dbmd=con.getMetaData();
			
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverMinorVersion());
			
			boolean isBatchingSupported = dbmd.supportsBatchUpdates();
		    
			int maxConnection = dbmd.getMaxConnections();
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(maxConnection);
			System.out.println("Batching Supported = " + isBatchingSupported);
			
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from student");
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int columncount=rsmd.getColumnCount();
			System.out.println(columncount);
			String tablename=rsmd.getTableName(2);
			System.out.println(tablename);
			System.out.println(rsmd.getColumnTypeName(1));
			System.out.println(rsmd.getColumnTypeName(2));	
		}
		catch(Exception e)
		{
		
		}
	}

}
