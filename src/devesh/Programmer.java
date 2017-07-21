package devesh;

class emp{
	void m(){
		System.out.println("Emp ");
	}
}

class emp1 extends emp{
	void m(){
		System.out.println("emp1");
	}
}
public class Programmer extends emp{
	void m(){
		System.out.println("isp");
	}
	public static void main(String[] args) {
		emp e1=new emp();
		emp1 e2 = new emp1();
		Programmer p1 = new Programmer();
		emp r;// super classred variable
		r = e1; r.m();
		r = e2; r.m(); // upcasting
		r = p1; r.m(); //upcasting
	}
}
