package dao;
import java.sql.*;

import model.Employee;
public class EmployeeDao {
public int registerEmplyoee(Employee e)throws ClassNotFoundException, SQLException{
	int result=0;
	String prep="insert into employee (`first name`, `last name`, `user name`, `password`, `address`, `phone`) values(?,?,?,?,?,?)";
	String url="jdbc:mysql://localhost:3306/employees";
	String uname="root";
	String pass="mysql";
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(Connection con=DriverManager.getConnection(url,uname,pass)){
	    PreparedStatement ps=con.prepareStatement(prep);
	    ps.setString(1,e.getFirstName());
	    ps.setString(2,e.getLastName());
	    ps.setString(3,e.getUserName());
	    ps.setString(4,e.getPassword());
	    ps.setString(5,e.getAddress());
	    ps.setString(6,e.getContact());
	    
	    result=ps.executeUpdate();
	}
	catch(Exception ee) {
		ee.getMessage();
	    result=-1;
	    }
	
	return result;
}
}
