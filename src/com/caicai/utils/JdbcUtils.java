package com.caicai.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtils {
	private static Connection c = null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306/sms";
		String user = "root";
		String password = "root";
		if (c == null || c.isClosed())
			c = DriverManager.getConnection(url,user,password);
		
		return c;
	}
	
	public static void CloseConnection(Connection c, PreparedStatement ps, ResultSet rs) throws SQLException{
		if (c != null)
			c.close();
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();
	}
	
}

