package jdbc2;
import java.sql.*;
import java.io.*;
public class CallFunction
{
	public void sum()
	{
		String answer=" ";
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
			do
			{
				System.out.println("Enter first number:");
				int i=Integer.parseInt(br.readLine());
				System.out.println("Enter second number:");
				int j=Integer.parseInt(br.readLine());
				cs.setInt(2,i);
				cs.setInt(3,j);
				
				cs.registerOutParameter(1,Types.INTEGER);
				cs.execute();
				int a=cs.getInt(1);
				System.out.println("The sum is:");
				System.out.println(a);
				System.out.println("Calculate sum again?:");
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
		new CallFunction().sum();
	}

}

/* Steps to create procedure
 * create function sumdisplay(one in number,two in number)
 * return number as total number;
 * begin
 * total:one + two;
 * return total;
 * end;
/
 */

