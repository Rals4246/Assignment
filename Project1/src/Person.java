import java.util.*;
import java.io.*;
public class Person {
	int age;
	int initialAge;
 static void main(String[] args) throws IOException {
		 int T;
		 
		 int[] age2=new int[20];
		 int[] age1=new int[20];
		 int[] intialAge=new int[20];
		 System.out.println("Enter the number of Testcases");
		 BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		  T= Integer.parseInt(b1.readLine());
		  if(T< 1|| T>4)
		  {
			
					 System.out.println("Invalid testcases, enter between 1 or 4");
					 System.out.println("Enter the number of Testcases");
					 T= Integer.parseInt(b1.readLine());
				 
		  }
		  else if((T>=1 || T<=4))
		 {
			 
			 
			 System.out.println("Enter the"+T+"ages of the persons");
			 BufferedReader b2=new BufferedReader(new InputStreamReader(System.in));
			 for(int i=0;i<T;i++)
			 {
				age1[i]=Integer.parseInt(b2.readLine()); 
				System.out.println("Enter the next Person's age");
			 }
			 
		 }
		 
		 
		 
		// Person p=new Person();
		 for(int j=0;j<T;j++)
		 {
		 intialAge[j]= age2[j];
		    //p.Person(intialAge[j]);
		 }
		

	}

	

	 Person(int initialAge) {
		
		if(initialAge>=0)
		{
			age= initialAge;
		}
		
		else
		{
			System.out.println("Age is not valid and setting age to '0'");
			initialAge=0;
	     }
	 }
}
