package devesh;

public class StaticMethod {
	static void h(){
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		h();
		StaticPerson.m();
		h();
	}
}
