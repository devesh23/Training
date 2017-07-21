package devesh;
// Single Inheritance
class employee{
	void m(){
		System.out.println("I am employee");
	}
	int salary = 40000;
}

public class Inherit extends employee{
	
	int bonus = 2000;
	
	
	void m(){
		System.out.println("Yo Uo Up");
	}
	
	public static void main(String[] args) {
		Inherit in = new Inherit();
		in.m();
		System.out.println(in.salary + "\t" + in.bonus);
	}
	
}
