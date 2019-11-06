package jdbc;
import java.sql.*;

public class Excel
{
	public static void main(String args[])
	{
		try
		{	
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:excel");
		
		Statement stat=con.createStatement();
		ResultSet rs=stat.executeQuery("select * from [sheet1$]");
		
		while(rs.next())
		{
			System.out.println("name ="+ rs.getString(1));
			System.out.println("salary ="+rs.getString(2));
		}
		
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}

}
