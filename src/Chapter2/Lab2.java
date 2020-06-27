package Chapter2;

public class Lab2 {
	Lab1 m1() {
		System.out.println("I am in Lab-m1");
		Lab1 b = new Lab1();
		return b;
		//return new Lab1(); // Single Step
	}
	public static void main(String[] args) {
		Lab2 a = new Lab2();
		// SCENARIO 1
		a.m1();
		// SCENARIO 2
		Lab1 b = a.m1();
		b.m6();
		
		
	}

}
