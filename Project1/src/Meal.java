import java.util.*;
import java.io.*;
public class Meal {
    static double totalCost;
	public static void main(String[] args) throws IOException {
		BufferedReader a1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader a2=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader a3=new BufferedReader(new InputStreamReader(System.in));
		double mealCost=Double.parseDouble(a1.readLine());
		int tipPercentage=Integer.parseInt(a2.readLine());
		int taxPercentage=Integer.parseInt(a3.readLine());
		//System.out.println(mealCost);
		/*Double cost=Double.parseDouble(mealCost);
		Double tip=Double.parseDouble(tipPercentage);
		Double tax=Double.parseDouble(taxPercentage);*/
		double tip=mealCost*((double)tipPercentage/100);
		double tax=mealCost*((double)taxPercentage/100);
		totalCost= mealCost+tip+tax;
		System.out.println(Math.round(totalCost));
	}

}
