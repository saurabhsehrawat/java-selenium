package jdbc;
import java.sql.*;
public class BatchUpdate
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
		
		Statement state=con.createStatement();
		
		String s1="update emp set ename='rajpaggal' where eid='1'";
		String s2="insert into emp values('ndasda','rajnagar')";
		
		state.addBatch(s1);
		state.addBatch(s2);
		state.executeBatch();
		
		ResultSet rs=state.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println("name="+rs.getString("ename"));
			System.out.println("id="+rs.getString("eid"));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
