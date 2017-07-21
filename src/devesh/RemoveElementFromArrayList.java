package devesh;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementFromArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Anil");
		al.add("Naveen");
		al.add("Vineet");
		al.add("santosh");
		al.add("ajay");
		System.out.println(al);
		Iterator i = al.iterator();
		String str = "";
		while(i.hasNext()){
			str = (String)i.next();
			if(str.equals("ajay")){
				i.remove();
			}
			System.out.println(str);
		}
		
	}
}
