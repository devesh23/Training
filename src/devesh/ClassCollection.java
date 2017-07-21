package devesh;

import java.util.ArrayList;
import java.util.Iterator;

class username{
	int id;
	String name;
	String city;
	
	username(int id,String name,String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}

public class ClassCollection {
	
	ArrayList<username> al = new ArrayList<>();
	
	public static void main(String[] args) {
		ClassCollection c = new ClassCollection();
		username u = new username(1, "devesh", "raipur");
		c.al.add(u);
		u = new username(2, "Prakhar", "Bhopal");
		c.al.add(u);
		u = new username(3, "Nandini", "Bilaspur");
		c.al.add(u);
		
		Iterator<username> i = c.al.iterator();
		while(i.hasNext()){
			u = (username)i.next();
			System.out.println(u.getCity() + " " + u.getId() + " " + u.getName());
		}
	}
}
