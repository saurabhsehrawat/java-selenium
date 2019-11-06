package jdbc;
import java.sql.*;
public class Callf
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
			if(con==null)
			{
			System.out.println("Connectiond could not be established");
			}
			else
			{
			System.out.println("Connected Successfully");
			}
			CallableStatement cs=con.prepareCall("{?= call sumdisplay(?,?)}");
			cs.setInt(2,20);
			cs.setInt(3,30);
			
			cs.registerOutParameter(1,Types.INTEGER);
			cs.execute();
			int a=cs.getInt(1);
			System.out.println(a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

/* Steps to create procedure
 * create function sumdisplay(one in number,two in number)
 * return number as total number;
 * begin
 * total:=one + two;
 * return total;
 * end;
	/
*/



