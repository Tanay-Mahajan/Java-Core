package Chapter5;

public class Lab1 {
	private int age ;
	public void setAge ( int agePerson) {
		if(agePerson > 0) {
			age = agePerson;
		}
		else {
			age = 0;
			
		}
		System.out.println("Age of the person is "+age);
	}
	public static void main(String[] args) {
		Lab1 a = new Lab1();
		a.setAge(45);
		a.setAge(-5);
	}
}
