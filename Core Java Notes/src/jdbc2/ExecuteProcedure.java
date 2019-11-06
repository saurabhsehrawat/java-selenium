package jdbc2;
import java.sql.*;

public class ExecuteProcedure
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","System");
		if(con==null)
		{
			System.out.println("Connection failed!!");
		}
		else
		{
			System.out.println("Connected Successfully");
		}
		
		CallableStatement ps=con.prepareCall("{call p1}");
		ps.executeUpdate();
		System.out.println("Value inserted successfully to the database");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


/*
 * create procedure p1
 * as
 * begin
 * insert into emp values('raj,'shetty');
 * end;
 */
 






