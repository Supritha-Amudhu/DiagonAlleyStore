package diagonalley.atech.model;
import java.sql.Connection;

import diagonalley.atech.dao.*;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registrationService extends jdbcConnection
{
	public void registerUser(String name, String ship, String bill, String email, String phone, String password, String confirmpassword)
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/diagonalley";
		String username = "root";
		String pwd = "r00t";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println(conn);
			String sql = "insert into registereduser(name, shippingaddress, billingaddress, email, phone, password, confirmpassword) values (?,?,?,?,?,?,?)";
			PreparedStatement preparedstatement = conn.prepareStatement(sql);
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, ship);
			preparedstatement.setString(3, bill);
			preparedstatement.setString(4, email);
			preparedstatement.setString(5, phone);
			preparedstatement.setString(6, password);
			preparedstatement.setString(7, confirmpassword);
			int rowsUpdated = preparedstatement.executeUpdate();	
			System.out.println(rowsUpdated);
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught.");
			ex.printStackTrace();
		}
	}
	

}
