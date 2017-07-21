package devesh;
import training.Mathematics;

public class Add implements Mathematics{
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
		System.out.println("Called in package devesh");
	}
	public static void main(String[] args) {
		Add a = new Add();
		a.calculate();
	}
}
