package com.caicai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.caicai.bean.Student;
import com.caicai.utils.JdbcUtils;

public class StudentDaoImpl implements IStudentDao {
	private Connection c = null;
	private Statement stat = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	@Override
	public Student selectStu(String num, String pass) {
		Student student = null;
		try {
			c = JdbcUtils.getConnection();
			
			String sql = "select *from stu where num = ? and pass = ?";
			ps = c.prepareStatement(sql);
			ps.setString(1, num);//
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if(rs.next())
			{
				
				String name = rs.getString(2);
				Integer age = rs.getInt(4);
				student = new Student((Integer)Integer.parseInt(num), name, pass, age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public void insertStu(String num, String pass, String name, String age) {
		
		try {
			c = JdbcUtils.getConnection();
			
			String sql = "insert into stu(name,num,age,pass) values(?,?,?,?)";
			ps = c.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, Integer.valueOf(num));
			ps.setInt(3, Integer.valueOf(age));
			ps.setString(4,pass);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				JdbcUtils.CloseConnection(c, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	
}
