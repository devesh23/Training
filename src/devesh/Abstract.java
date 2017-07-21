package devesh;


abstract class shape{
	int a = 20;
	void m(){
		System.out.println("I am shape");
	}
	abstract void draw();
	shape(){
		System.out.println("Constructor");
	}
}

class circle extends shape{
	circle(){
		super();
		System.out.println("Cons circ");
	}
	
	@Override
	void draw(){
		System.out.println("And I am called Circle");
	}
}

public class Abstract extends shape{
	Abstract(){
		super();
		System.out.println("Cons Rect");
	}
	
	@Override
	void draw(){
		System.out.println("Rectangle");
	}
	public static void main(String[] args) {
		shape ob = new Abstract();
		shape ob1 = new circle();
		System.out.println(ob.a +" "+ ob1.a );
		ob.draw();ob1.draw();
	}
}
