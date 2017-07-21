package training;

public class Maths implements Mathematics{
	int a,b,c;
	public Maths() {
		// TODO Auto-generated constructor stub
		a=0;
		b=0;
		c=0;
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Calcuulate from traiing called");
	}
	public static void main(String[] args) {
			Maths a = new Maths();
			a.calculate();
	}
}
