package devesh;
import devesh.NestedInterface;
public class NestInterface implements NestedInterface, NestedInterface.NestedInterface2{
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	@Override
	public void hello1() {
		// TODO Auto-generated method stub
		System.out.println("Hello1");
	}
	public static void main(String[] args) {
		NestInterface a = new NestInterface();
		a.hello();
		a.hello1();
	}
}
