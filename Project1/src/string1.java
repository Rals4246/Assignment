import java.io.*;
import java.util.*;
public class string1 {

	public static void main(String[] args) throws IOException {
		String S;
		System.out.println("Enter the string with Delimiters");
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		S=b1.readLine();
		String[] a= S.split(";");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
