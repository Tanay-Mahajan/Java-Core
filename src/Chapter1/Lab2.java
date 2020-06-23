package Chapter1;

public class Lab2 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean bl;
	void show() {
		System.out.println("variables & Constants demo");
		System.out.println(b);
		System.out.println(d);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(bl);
		System.out.println(l);
		System.out.println(f);
		
	}
	void show2() {
		System.out.println("Integer Literal demo");
		int a = 12;
		int b = 10;
		int c = 0x12a;
		Byte d = 012;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
		
	void show3() {
		System.out.println("floating point literal demo");
		float f1 = 99.97f;
		double d1 = 9.9e-9;
		double d2 = 9.9E+9;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(d2);
	}
	void show4() {
		System.out.println("character literal demo");
		char ch1 = 'A';
		int x1 = 'A';
		char ch3 = 'I';
		int x3 = 'I';
		System.out.println(ch1);
		System.out.println(x1);
		System.out.println(ch3);
		System.out.println(ch3);
		System.out.println(x3);
	
	}
	void show5() {
		System.out.println("Boolean Literal demo");
		boolean bb1 = false;
		boolean bb2 = true;
		System.out.println(bb1);
		System.out.println(bb2);
	}
	void show6() {
		System.out.println("string literal demo");
		String ste1 = "";
		String ste2 = "123 abc+";
		String ste3 = "1";
		System.out.println("ste1 "+ ste1);
		System.out.println(ste1.length());
		System.out.println("Ste2 = " + ste2);
		System.out.println(ste2.length());
		System.out.println("ste3 = "+ste3);
		System.out.println(ste3.length());
		
	}
}
