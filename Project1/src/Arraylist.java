import java.util.*;
import java.io.*;
public class Arraylist {
static String name,address;
static int id;
static long phone;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    ArrayList al=new ArrayList();
		System.out.println(" Enter the Employee Id, Employee Name,Phone Number, Address ");
		id=Integer.parseInt(br.readLine());
		al.add(id);
		name=br.readLine();
		al.add(name);
		phone=Long.parseLong(br.readLine());
		al.add(phone);
		address=br.readLine();
		al.add(address);
		System.out.println(al);
		Collections ArrayList;
	}
		
		
		
	}
	
