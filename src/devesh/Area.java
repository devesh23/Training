package devesh;

class triangle{
	double area;
	double breadth;
	double height;
	triangle(double breadth,double height){
		this.breadth = breadth;
		this.height = height;
		area = 0.0;
		area = 0.5 * breadth * height;
	}
	void disp(){
		System.out.println(area);
	}
}

public class Area extends triangle{
	double area;
	double breadth;
	double height;
	Area(double breadth,double height){
		super(breadth,height);
		area= breadth * height;
	}
	void disp(){
	
		System.out.println(area);
	}
	
	public static void main(String[] args) {
	
		
		triangle a = new Area(10,20);
		
		Area b = new Area(10,20);
		
		b.disp();
	}
}
