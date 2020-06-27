package Chapter2;

//import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AvgLogic {
	int avg(int a, int b) {
		SumLogic s1 =  new SumLogic();
		int sum = s1.sum(a, b);
		return sum/2;
	}
	public static void main(String[] args) {
		AvgLogic a1 = new AvgLogic(); 
		
		int a = 9;
		int b = 9;
		System.out.println("Average of two number is :");
		System.out.print(a1.avg(a, b));
		//s1.close();
	}
}