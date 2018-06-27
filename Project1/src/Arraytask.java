import java.util.*;
import java.io.*;
public class Arraytask {
	static int i,n;
	static int[] A=new int[100];

	public static void main(String[] args) throws IOException  {
		
		System.out.println("Enter the Size of Array");
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b1.readLine());
		System.out.println("Enter the Elements of Array");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			
			A[i]=sc.nextInt();
			
		}
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(A[j]+" ");
			
		}
		
		
		
	}

}
