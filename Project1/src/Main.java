import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
	 int i;
	 BufferedReader b1= new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the Number of lines");
	 int n = Integer.parseInt(b1.readLine());
	 int f=n,r=n;
	 int j;
		for(i=1;i<=n;i++)
		{
			//Front  spaces for line 
			for(j=1;j<f;j++)
			{
				System.out.print(" ");
		    }
			//Stars in the line
			for(j=f;j<=r;j++)
			{
				System.out.print("*");
		    }
			//Back  spaces for line 
			for(j=r+1;j<=(2*n-1);j++)
			{
				System.out.print(" ");
		    }
			f--;
			r++;
			System.out.println("");
		}
	}

}
