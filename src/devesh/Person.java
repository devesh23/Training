package devesh;

public class Person {
	int age;
	String name;
	int no;
	Person(){
		System.out.println("hi");
	}
	Person(int age,String name){
		this();
		this.age = age;
		this.name = name;
	}
	Person(int age,String name,int no){
		this(age,name);
		this.no = no;
		
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person(10,"Devesh");
		Person p2 = new Person(10,"Devesh",5);
	}
}
