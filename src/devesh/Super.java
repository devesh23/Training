package devesh;

class emp3{
	int age;
	emp3(){
		System.out.println("Parent Class Constructor");	
		age = 20;
	}
	void disp(){
		System.out.println("Parent Class Method");
	}
}

public class Super extends emp3{
	int age;
	Super(){
		
		age = 25;
		System.out.println("Subclass Constructor");
	}
	void disp(){
		super.disp();
		System.out.println("Subclass Method Hola");
	}
	void disp2(){
		System.out.println(age);
		System.out.println(super.age);
	}
	public static void main(String[] args) {
		Super ob1 = new Super();
		ob1.disp();
		ob1.disp2();
	}
}
