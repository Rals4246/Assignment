import java.util.*;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.io.*;

public class JDBC {
	
static int emp_id;
static long phone_number;
static String name,address;
	public static void main(String[] args) throws IOException, SQLException {
		//Code for connecting to Database.....
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example?autoReconnect=true&useSSL=false","root","root1");
			System.out.println("Database link established");
			
			//Inserting elements dynamically from Collections
			setEmployee(emp_id,name,phone_number,address);
			//Retrieving all Fields from Database
		    getEmployee(emp_id,name,phone_number,address);
		
		 //Ending the Database Connection.
					con.close();	
			 } 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
			
	}
	
	
	private static void getEmployee(int emp_id2, String name2, long phone_number2, String address2) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example?autoReconnect=true&useSSL=false","root","root1");
		PreparedStatement ps=con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("Employee id:"+rs.getInt(1));
			System.out.println("Employee Name:"+rs.getString(2));
			System.out.println("Employee Phone:"+rs.getLong(3));
			System.out.println("Employee Address:"+rs.getString(4));
		}
		
	}
	public  static void setEmployee(int emp_id,String name1,Long phone_number,String address1) throws IOException,SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example?autoReconnect=true&useSSL=false","root","root1");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    ArrayList al=new ArrayList();
		System.out.println(" Enter the Employee Id, Employee Name,Phone Number, Address ");
		emp_id=Integer.parseInt(br.readLine());
		al.add(emp_id);
		name1=br.readLine();
		al.add(name1);
		phone_number=Long.parseLong(br.readLine());
		al.add(phone_number);
		address1=br.readLine();
		al.add(address1);
		System.out.println(al);
		PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?)");
		st.setInt(1,emp_id);
	    st.setString(2,name1 );
		st.setLong(3,phone_number);
		st.setString(4,address1);
		
		st.executeUpdate();
		System.out.println("Inserted Suucessfully");
		
	}
	
}
