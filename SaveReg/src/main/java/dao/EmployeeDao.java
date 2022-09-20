package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
public boolean validate(String uname,String upass) throws ClassNotFoundException {
	String prep="select * from employee where `user name`=? and password=?";
	String url="jdbc:mysql://localhost:3306/employees";
	String name="root";
	String pass="mysql";
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(Connection con=DriverManager.getConnection(url,name,pass)){
	    PreparedStatement ps=con.prepareStatement(prep);
	    ps.setString(1,uname);
	    ps.setString(2,upass);
	    ResultSet re=ps.executeQuery();
	    if(re.next()) {
	    	 System.out.println("valid user");
	    	 return true;
	    }
	   
	    
	}
	catch(Exception ee) {
		ee.getMessage();
	    }
	return false;
}
}
