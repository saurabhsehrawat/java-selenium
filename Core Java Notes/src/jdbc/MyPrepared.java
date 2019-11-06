package jdbc;
import java.sql.*;

public class MyPrepared
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		if(con==null)
		{
		System.out.println("not connected");
		}
		else
		{
		System.out.println("Connected Successfully");	
		}
		
		PreparedStatement ps=con.prepareStatement("INSERT INTO emp (ename,eid) VALUES (?,?)");
		ps.setString(1, "Abhishek");
		ps.setString(2, "Noida");
		
		int i=ps.executeUpdate();
		System.out.println(i+"Records updated");
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
