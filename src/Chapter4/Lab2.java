package Chapter4;

public class Lab2 {

	static int a = 31;
	static int b;
	static void math(int x) {
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	static {
		System.out.println("Static block initialised. ");
		b = a * 4;
		
	}
	public static void main(String[] args) {
		System.out.println("before static method b = "+b);
		math(42);
	}
}
