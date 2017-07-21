package devesh;

class hello{
	private String name = "Hello";
	
	private void changeName(String name){
		this.name = name;
	}
	
	protected hello changename(String name){
		hello temp = new hello();
		temp.changeName(name);
		return temp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class AccessPrivateMember {
	public static void main(String[] args) {
		hello he = new hello();
		String name = he.getName();
		System.out.println(name);
		
		he = he.changename("Devesh");
		name = he.getName();
		System.out.println(name);
	}
}
