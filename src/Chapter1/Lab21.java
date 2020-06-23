package Chapter1;

public class Lab21 {
	public static void main(String[] args) {
		int n = 12;
		for(int i = 1;i<n;i++) {
			if(i%2==0) {
				System.out.println(i+"Next is continue");
				continue;
			}else if(i==9) {
				System.out.println("i is 9");
				break;
			}
			System.out.println("OK"+i);
		}
		System.out.println("Done");
	}

}
