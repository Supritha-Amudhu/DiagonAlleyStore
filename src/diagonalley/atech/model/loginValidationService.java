package diagonalley.atech.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginValidationService 
{
	public String validateUser(String email, String password)
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/diagonalley";
		String username = "root";
		String pwd = "r00t";
		String result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println(conn);
			String sql = "select email, name, password from registereduser where email=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String uname = rs.getString("name");
				String password1 = rs.getString("password");
				if(password.equals(password1))
				{
					result = uname;
				}	
				else
				{
					result = "fail";
				}
			}		
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught when validating user login.");
			ex.printStackTrace();
		}
		return result;
	}
}
