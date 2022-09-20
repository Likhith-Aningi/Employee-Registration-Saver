package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;

@SuppressWarnings("serial")
@WebServlet("/EmplyeeLogin")
public class EmplyeeLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uid=request.getParameter("uid");
		String pass=request.getParameter("upass");
		EmployeeDao e=new EmployeeDao();
		request.setAttribute("uid", uid);
		RequestDispatcher eligible=request.getRequestDispatcher("/WEB-INF/view/welcome.jsp");
		RequestDispatcher ineligible=request.getRequestDispatcher("/WEB-INF/view/login.jsp");
		try {
			if(e.validate(uid,pass)) {
				eligible.forward(request, response);
			}
		//ineligible.forward(request, response);
		} catch (Exception e1) {
			
			e1.printStackTrace();
		} 
		ineligible.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/login.jsp");
		rd.forward(request, response);
		
		
	}

}
