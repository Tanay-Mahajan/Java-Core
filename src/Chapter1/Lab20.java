package Chapter1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		int n = scanner.nextInt();
		System.out.println("While ");
		int i = 1;
		while(i<=n)
			System.out.println("ok"+i);
		if(i%5==0) {
			System.out.println(i);
		}
		i++;
		System.out.println("do_While");
		i = 1;
		do {
			if((i % 5)==0) {
				System.out.println(i);
			}
			i++;
			System.out.println("ok"+i);
		}while(i<=n);
	}

}
