package jdbc;
import java.sql.*;
public class Test3
{
	public static void main(String args[])
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:student");	
			//scrollable demo
	Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stat.executeQuery("select * from student");
	while(rs.next())
	{
	System.out.println("Name=" +rs.getString(1));
	System.out.println("ID=" + rs.getString(2));
	}
	while(rs.previous())
	{
	System.out.println("Name ="+ rs.getString(1));
	System.out.println("ID =" + rs.getString(2));
	}}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
