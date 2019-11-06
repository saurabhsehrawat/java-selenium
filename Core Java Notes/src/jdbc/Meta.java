package jdbc;
import java.io.*;
import java.sql.*;
public class Meta
{
	public static void main(String[] args)
	{
		Connection connection = null;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection( "jdbc:odbc:excel" );
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery( "Select * from [Sheet1$]" );
	
			ResultSetMetaData rsmd = rs.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();
			System.out.println(numberOfColumns);
			String b = rsmd.getColumnName(1);
			String c=rsmd.getColumnName(2);
			System.out.println(b+"\t"+c);
			st.close();
			con.close();
		}
		catch(Exception ex) {
			System.err.print(ex);
			
		}
	}
}
