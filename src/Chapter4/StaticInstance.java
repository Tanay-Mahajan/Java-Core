package Chapter4;

public class StaticInstance {
	int a = 10;
	static int b = 20;
	void sop() {
		System.out.println("Hello Tanay");
		System.out.println(a);
		System.out.println(b);
	}
	static void tanay() {
		System.out.println("Hello Tanay");
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		StaticInstance staticInstance = new StaticInstance();
		System.out.println(staticInstance.a);
		System.out.println(staticInstance.b);
		staticInstance.sop();
		staticInstance.tanay();
	}

}
