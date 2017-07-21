package devesh;

public class Method_overloading {
	
	void display(int a,int b){
		System.out.println(a+b);
	}
	void display(int a,int b,int d){
		System.out.println(a+b+d);
	}
	void display(int a,int b,float c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Method_overloading ob1 = new Method_overloading();
		Method_overloading ob2 = new Method_overloading();
		
		ob1.display(45, 68);
	
		ob2.display(4, 8, 9);
		ob2.display(4, 8, 2.11f);
	}
}
