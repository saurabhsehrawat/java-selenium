package jdbc2;
import java.io.*;
import java.sql.*;
public class MyRun
{
	Connection con;
	PreparedStatement ps;
	
	public void insert()
	{
		String answer=" ";
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","system");
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//con=DriverManager.getConnection("jdbc:odbc:mydsn");
			
			ps=con.prepareStatement("insert into emp values(?,?)");
			do{
				System.out.println("Enter Employee Name");
				String name=br.readLine();
				System.out.println("Enter employee ID");
				String id=br.readLine();
				
				//int ii=Integer.parseInt(id);
				ps.setString(1, name);
				ps.setString(2, id);
				//ps.setInt(3, ii);
				int i=ps.executeUpdate();
				System.out.println(i+"row created");
				answer=br.readLine();
			}
			while(answer.equals("yes"));	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String args[])
	{
		new MyRun().insert();
	}
	

}
