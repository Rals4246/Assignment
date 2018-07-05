import java.sql.*;
import java.util.*;
public class ForeignKey {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example?autoReconnect=true&useSSL=false","root","root1");
		System.out.println("Database link established");
		Statement st=con.createStatement();
		st.execute("create table EmpDetails(emp_id int NOT NULL, c_id int NOT NULL,emp_name varchar(30) Not NULL,emp_salary int, PRIMARY KEY(c_id), Foreign KEY(emp_id) References employee(emp_id))");
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
