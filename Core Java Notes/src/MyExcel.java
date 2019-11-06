
import java.sql.*;

public class MyExcel
{
	public static void main(String args[])
	{
		try
		{
			
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:excel");
		
		Statement stat=con.createStatement();
		
		// you must uncheck the read-only option from the the DSN, from where we choose the workbook 
		int i=stat.executeUpdate("update [Sheet1$] set EMP='mangesh' where salary=50000");
		
		System.out.println("Records updated successfully");
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}

}
