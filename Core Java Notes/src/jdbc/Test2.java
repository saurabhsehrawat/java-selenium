package jdbc;
import java.sql.*;
public class Test2
{
	public static void main(String args[])
	{	
		try
		{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:emp");
		
Statement ss=con.createStatement();
		
ResultSet rs=ss.executeQuery("select * from emp");
	while(rs.next())
	{
System.out.println("Student Name ="+ rs.getString(1));
System.out.println("Student ID ="+rs.getString(2));
		}	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
