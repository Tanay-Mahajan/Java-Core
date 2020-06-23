package Chapter1;

public class Lab9 {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		System.out.println("Value of a before : "+a);
		System.out.println("Value of b before : "+b);
		System.out.println("Value of a after negation: "+ ~a);
		System.out.println("Value of a after negation: "+ ~b);
		
		System.out.println("Result of a&b is : "+(a&b));
		System.out.println("Result of a|b is : "+(a|b));
		System.out.println("Result of a^b is : "+(a^b));
		int no = 8;
		System.out.println("Original number : "+no);
		no = no << 1;
		System.out.println("Value after left shift : "+no);
		no = -8;
		no = no >>1;
		System.out.println("Value after right shift with sign : "+no);
		no = -8;
		no = no>>>1;
		System.out.println("Value after right shift with sign : "+no);
	}

}
