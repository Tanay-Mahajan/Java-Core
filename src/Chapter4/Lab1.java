package Chapter4;

public class Lab1 {
	static int ctr = 0;
	int i = 100;
	{
		System.out.println("Before change in local block");
		System.out.println("Ctr = "+ctr);
		System.out.println("i = "+ i);
		int ctr = 2,i=200;
		System.out.println("");
		System.out.println("After Change in local block ");
		System.out.println("ctr = "+ctr);
		System.out.println("i = "+i);
		
	}
	void display() {
		System.out.println("In another method");
		System.out.println("ctr = "+ctr);
		System.out.println("i = "+i);
		
	}
	public static void main(String[] args) {
		Lab1 a = new Lab1();
		System.out.println("");
		a.display();
	}
}
