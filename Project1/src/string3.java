
import java.io.*;
import java.util.*;
public class string3 {

	public static void main(String[] args) throws IOException {
		String S;
		System.out.println("Enter the string with atleast 10 characters");
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		S=b1.readLine();
		String a=S.substring(5, 10);
			System.out.println(a);
		
		

	}

}