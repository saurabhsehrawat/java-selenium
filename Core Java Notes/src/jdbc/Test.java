package jdbc;
import java.sql.*;
public class Test
{
	public static void main(String args[])
	{
		try
		{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
	
Statement st=con.createStatement();
		
ResultSet rs=st.executeQuery("SELECT * FROM student");
		while(rs.next())
		{
			System.out.println("student name = "+ rs.getString(1));
			System.out.println("student address = " + rs.getString(2));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}	
}
