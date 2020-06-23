package Chapter1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		int input = scanner.nextInt();
		if(input < 0) {
			System.out.println(" The Number is Negative");
		}else {
			System.out.println(" The Number is Positive");
		}
	}
}
