package com.caicai.service;

import com.caicai.bean.Student;

public interface IStudentService {

	Student check(String num, String pass);

	void insertStudent(String num, String pass, String name, String age);
	
}
