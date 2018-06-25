import java.util.*;
import java.io.*;
public class table {

	public static void main(String[] args)  throws IOException{
		int i;
		 BufferedReader b1= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the table number");
		 int n = Integer.parseInt(b1.readLine());
		 for(i=1;i<=10;i++)
		 {
			 System.out.println(n+"*"+i+"="+""+(n*i));
		 }
	}

}
