package devesh;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTemp {
	public static void main(String[] args) {
		Vector v = new Vector(3,3);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.addElement(100);
		v.add(120);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.elementAt(3));
		
		Enumeration e = v.elements();  
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
