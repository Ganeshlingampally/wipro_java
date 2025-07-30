package JDBC_Demoo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Dem {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       // Step 1 : Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		// Step 2 : Establish the connection
		
		try{ Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wipro_jdbc", "root", "root");
		System.out.println("Connection Created");
		
		Statement sta = con.createStatement();
		ResultSet res = sta.executeQuery("select * from wipro_emps");
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getString(4));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		finally
		{
			System.out.println("Sucessfull");
		}
		
		
	}
	

}
/* 
public class StudentDatabase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Vinitha@123");
			Statement sta=con.createStatement();
			ResultSet rs=sta.executeQuery("select * from StudentT");
			)
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Done");
		}
		
	}

}
 */
