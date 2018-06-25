import java.io.*;
import java.util.*;
public class string2 {

	public static void main(String[] args) throws IOException {
		String S;
		System.out.println("Enter the string with & in between them");
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		S=b1.readLine();
		String a=S.replace('&', '1');
			System.out.println(a);
		
		

	}

}