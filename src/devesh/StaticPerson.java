package devesh;

public class StaticPerson {
	static int count = 0;
	
	StaticPerson(){
		count++;
		System.out.println(count);
	}
	static void m(){
		System.out.println("Hola Hola La la al ");
		StaticMethod.h();
	}
	public static void main(String[] args) {
		StaticPerson m = new StaticPerson();
		StaticPerson m1 = new StaticPerson();
		StaticPerson m2 = new StaticPerson();
	}
}
