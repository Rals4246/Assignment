import java.util.*;
import java.io.*;
public class Userexception {
static int n;
	public static void main(String[] args)throws IOException {
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		verifyage(n);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
				
				
				
	}
	private static void verifyage(int age)throws InvalidStringException {
		
		if(age<=0)
		{
			throw new InvalidStringException("It is Invalid, Enter a valid Integer");
		}
		else 
			System.out.println("your Age is:"+age);
		}
	}


