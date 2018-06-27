import java.util.*;
import java.io.*;

public class Person {

	int age;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int personage[];
		
		BufferedReader p1=new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("enter the number of testcases");
		 
	     int T=Integer.parseInt(p1.readLine());
	     personage = new int[T];
	     for (int a=0;a<T;a++)
	     {
	    	 int b =Integer.parseInt(p1.readLine());
	    	 personage[a]=b; 
	     }
	     for (int age_times=0; age_times<personage.length; age_times++)
	     {
	    	Person check_age = new Person(personage[age_times]);
	    	check_age.amiOld();
	    	check_age.yearPasses();
	    	check_age.yearPasses();
	    	check_age.yearPasses();
	    	check_age.amiOld();
	    	
	    	
	    	
	     }
	     
	     
	}
	
	public Person(int initialAge)
	{
		if (initialAge<0)
		{	
			System.out.println("age is not valid");
			age=0;
		}
		else
		{
			age=initialAge;
		}
		
	}
	
	public void yearPasses()
	{
		age=age+1;
		
	}

	public void amiOld()
	{
		if (age<13)
			System.out.println("you are young");
		else if(age>=13 && age<18)
			System.out.println("you are teenager");
		else 
			System.out.println("you are old");	
			
	}
}