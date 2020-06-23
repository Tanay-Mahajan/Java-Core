package Chapter1;

public class Lab11 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 1;
		if ((a > b) && (a>c)) {
			System.out.println("Min : "+a);
		}else if(b>c) {
			System.out.println("Min : " +c);
		}
		if (a < b) {
			if( a < c) {
				System.out.println("Min : "+a);
			}else {
				System.out.println("Min : "+c);
			}
		}else {
			if(b < c) {
				System.out.println("Min : "+b);
			}else {
				System.out.println("Min : "+c);
			}
		}
		
	
	}

}
