package Chapter1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		int n = scanner.nextInt();
		int sum = 0;
		while(n !=0) {
			int r = n%10;
			sum += r;
			n = n/10;
		}
		System.out.println("Sum = "+sum);
		
	}

}
