package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setFirstName(req.getParameter("firstName"));
		e.setLastName(req.getParameter("lastName"));
		e.setUserName(req.getParameter("userName"));
		e.setPassword(req.getParameter("password"));
		e.setAddress(req.getParameter("address"));
		e.setContact(req.getParameter("contact"));
		EmployeeDao dao=new EmployeeDao();
		RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/view/EmployeeStatus.jsp");
		RequestDispatcher err=req.getRequestDispatcher("/WEB-INF/view/Error.jsp");
		int status=-3;
		try {
			status = dao.registerEmplyoee(e);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("enter avvaled bro "+status);
			e1.printStackTrace();
			
			err.forward(req, response);
			return;
		}
		System.out.println(status);
		rd.forward(req, response);
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/view/EmployeeRegister.jsp");
		rd.forward(req, response);
	}

}
