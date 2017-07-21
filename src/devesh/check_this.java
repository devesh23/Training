package devesh;

public class check_this {
	void message(){
		System.out.println(this);
	}
	public static void main(String[] args) {
		check_this c = new check_this();
		System.out.println(c);
		c.message();
	}
}
