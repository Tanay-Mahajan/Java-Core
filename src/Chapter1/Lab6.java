package Chapter1;

public class Lab6 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = (a<b) ? a:b;
		int max = (a>b) ? a:b;
		System.out.println("Min :: "+min);
		System.out.println("Max :: "+max);
		
	}

}
