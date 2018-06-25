import java.util.*;
import java.io.*;
import java.io.*;
public class star {
	public static void main(String[] args) throws IOException {
	 int i;
	 BufferedReader b1= new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the Number of lines");
	 int n = Integer.parseInt(b1.readLine());
	 for(i=1;i<=n;i++)
	 {
		 for(int j=i;j>0;j--)
		 {
			 System.out.print("*");
		 }
		 System.out.print("\n");
	 }
	}
}