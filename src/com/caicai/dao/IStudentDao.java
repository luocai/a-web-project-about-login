package com.caicai.dao;

import com.caicai.bean.Student;

public interface IStudentDao {
	public Student selectStu(String num, String pass);

	public void insertStu(String num, String pass, String name, String age);
}
