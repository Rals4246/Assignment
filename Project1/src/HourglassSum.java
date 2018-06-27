import java.util.*;
import java.io.*;

public class HourglassSum {
 static int[][] A=new int[10][10];
 static int i,j;
 static int sum,value=0;
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the matrix with a space");
	Scanner br=new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(i=0;i<=5;i++)
		{
			for(j=0;j<=5;j++)
			{
				
				A[i][j]=br.nextInt();
			}
		}
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=3;j++)
			{
				sum=A[i][j]+A[i][j+1]+A[i][j+2]+A[i+1][j+1]+A[i+2][j]+A[i+2][j+1]+A[i+2][j+2];
				if(sum>=value)
				{
					value=sum;
				}
				
			}
		}
		
		System.out.println("The sum is:"+value);
		
		
	}

}
