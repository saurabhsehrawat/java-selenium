package jdbc2;
import java.sql.*;

public class Exp
{
	Connection con;
	Statement st;
	ResultSet rs;
	
		void select()
		{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:mydsn");
			
			st=con.createStatement();
			rs=st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println("Emp Name :"+ rs.getString(1));
				System.out.println("Emp ID :"+ rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		public static void main(String args[])
		{
			new Exp().select();
		}
	}


