package devesh;

class square{
	int d;
	square(){
		System.out.println("Super constructor is called");
	}
}

public class Cube extends square{
	
	int side;
	
	Cube(){
		side = 0;
		System.out.println("Default constructor is called");
	}
	
	Cube(int side){
		System.out.println("Cube is initialized as " + side);
		this.side = side;
	}
	Cube(int side, int side2){
		System.out.println("Cube is initialized as " + (side+side2));
		this.side = side + side2;
	}
	Cube(Cube ob){
		this.side = ob.side;
	}
	
	int insert(){
		return side*side*side;
	}
	
	void display_cube(){
		System.out.println("Cube of " + side + " is " + (side*side*side));
	}
	
	public static void main(String[] args) {
		
		Cube ob1 = new Cube(22);
		Cube ob2 = new Cube(32,32);
		Cube ob4 = new Cube(ob2);
		Cube ob3 = new Cube();
		ob1.display_cube();
		ob2.display_cube();
		ob3.display_cube();
		ob4.display_cube();
	}
}
