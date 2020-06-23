package Chapter1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab12 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(new InputStreamReader(System.in));
		System.out.println("Reading input from console using Scanner in Java ");
        System.out.print("Please Enter the size of array => ");
        int input = scanner.nextInt();

    	int num[] = new int[input];
	
        //System.out.println("Enter Size of the array : " +input);
        
        for(int i=0;i<input;i++) {
        	System.out.println("Enter the Number -"+i);
        	System.out.print("=> ");
        	num[i] = scanner.nextInt();
        }
        int max = num[0];
        for (int i=0;i<input;i++) {
        	if (num[i] > max) {
        		max = num[i];
        	}
        	
        }
        System.out.println("Max number is : "+max);
       
	}

}
