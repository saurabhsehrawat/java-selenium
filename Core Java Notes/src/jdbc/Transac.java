package jdbc;
import java.sql.*;
public class Transac
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		//Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
		
		System.out.println("Connected Successfully");
		
		Statement stat=con.createStatement();
		con.setAutoCommit(false);
		
		int x=stat.executeUpdate("update emp set ename='mangesh' where eid='1'");
		
		ResultSet rs=stat.executeQuery("select * from emp where eid='1'");
		while(rs.next())
		{
			System.out.println("name =" +rs.getString(1));
			System.out.println("eaddress=" +rs.getString(2));	
		}
		con.rollback();
		System.out.println("After Rollback");
		
		ResultSet rs2=stat.executeQuery("select * from emp where eid='1'");
		while(rs2.next())
		{
			System.out.println("name ="+ rs2.getString(1));
			System.out.println("id ="+ rs2.getString(2));
		}
		con.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
