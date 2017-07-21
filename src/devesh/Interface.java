package devesh;

interface a{
	void insert();
	int k = 10;
}
interface b{
	void display();
	int s = 200;
}
abstract class rect implements a,b{
	@Override
	public void insert() {
		// TODO Auto-generated method stub
	  System.out.println("abstract implement a ");
	}
}
public class Interface extends rect implements a,b {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
	}
	public static void main(String[] args) {
		Interface Interface = new Interface();
		Interface.display();
		Interface.insert();
	}
}
