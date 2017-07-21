package devesh;

public class StaticBlock {
	static int a;
	static
	{
		System.out.println("Static Block");
		int a = 20;
		System.out.println(a);
		m();
	}
	public StaticBlock() {
		// TODO Auto-generated constructor stub
		System.out.println("hi");
	}
	static void m(){
		System.out.println("Hola");
	}
	public static void main(String[] args) {
		m();
	}
}
