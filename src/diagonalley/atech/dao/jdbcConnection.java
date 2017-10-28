package diagonalley.atech.dao;
import diagonalley.atech.controller.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnection
{
	public void connection()
	{
		try
		{
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/diagonalley";
			String username = "root";
			String pwd = "r00t";	
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println(conn);
		}
		catch(Exception ex)
		{
			System.out.println("Exception in JDBC connection.");
			ex.printStackTrace();
		}
	}	
	
}

