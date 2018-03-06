package com.caicai.servlet;

import java.io.IOException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;

import com.caicai.bean.Student;
import com.caicai.service.IStudentService;
import com.caicai.service.StudentServiceImpl;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		
		HttpSession session = request.getSession();
		
		String msg = null;
		
		if(num == null || "".equals(num.trim()))
		{
			msg = "—ß∫≈ ‰»Î”–ŒÛ";
			session.setAttribute("msg", msg);
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			System.out.print(msg);
			
		}
		else if(pass == null || "".equals(pass.trim()))
		{
			msg = "√‹¬Î ‰»Î”–ŒÛ";
			session.setAttribute("msg", msg);
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			System.out.print(msg);
		}
		else
		{
			Student student = null;
			session.setAttribute("msg", msg);
			session.setAttribute("msg", msg);
			IStudentService service = new StudentServiceImpl();
			student = service.check(num, pass);
			
			if (student == null){
				msg = "’À∫≈ªÚ’ﬂ√‹¬Î ‰»Î¥ÌŒÛ";
				System.out.print(msg);
				response.sendRedirect(request.getContextPath() + "/login.jsp");
			}else
			{
				response.sendRedirect(request.getContextPath() + "/content.jsp");
			}
		}
		
	}

}
