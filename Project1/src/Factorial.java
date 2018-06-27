import java.util.*;
import java.io.*;
public class Factorial {
	static int n, sub;
	//static int[] total=new int[30];
	//static int factorial(1)=1;
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Number to find its Factorial");
		
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     n=Integer.parseInt(br.readLine());
     Factorial f=new Factorial();
     System.out.println("The factorial of the given number is :" + f.factorial(n));

	}
	private int factorial(int n) {
		
		if(n==1)
		{
			return 1;
		
		}
		else
		{
			sub=factorial(n-1)*n;
		}
		
		return sub;
		
		
	}

}
