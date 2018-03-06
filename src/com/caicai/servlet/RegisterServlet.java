package com.caicai.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caicai.service.IStudentService;
import com.caicai.service.StudentServiceImpl;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		IStudentService service = new StudentServiceImpl();
		service.insertStudent(num, pass, name,age);
		
		
	}

}
