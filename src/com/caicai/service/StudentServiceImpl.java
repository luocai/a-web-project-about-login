package com.caicai.service;

import com.caicai.bean.Student;
import com.caicai.dao.IStudentDao;
import com.caicai.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService {
	Student student = null;
	@Override
	public Student check(String num, String pass) {
		IStudentDao dao = new StudentDaoImpl();
		student = dao.selectStu(num, pass);
		return student;
	}
	@Override
	public void insertStudent(String num, String pass, String name, String age) {
		IStudentDao dao = new StudentDaoImpl();
		dao.insertStu(num, pass,name, age);
		
	}

}
