package Chapter1;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter the Day No = > ");
		int input = scanner.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("THE DAY IS MONDAY");
			break;
		case 2:
			System.out.println("THE DAY IS TUESDAY");
			break;
		case 3:
			System.out.println("THE DAY IS WEDNESDAY");
			break;
		case 4:
			System.out.println("THE DAY IS THUSDAY");
			break;
		case 5:
			System.out.println("THE DAY IS FRIDAY");
			break;
		case 6:
			System.out.println("THE DAY IS SATURDAY");
			break;
		case 7:
			System.out.println("THE DAY IS SUNDAY");
			break;
		default :
			System.out.println("Number is out of range ");
		}
		
	}

}
