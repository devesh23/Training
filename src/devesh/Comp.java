package devesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class compare implements Comparable{

	
	int no,age;
	String name;
	public compare(int no,int age,String name){
		this.no = no;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		compare e1 = (compare)o;
		if(age==e1.age) return 0;
		if(age>e1.age) return 1;
		else return -1;
	}
	
}

public class Comp {
	public static void main(String[] args) {
		compare comp = new compare(1,21,"Devesh");
		ArrayList<compare> al = new ArrayList<>();
		al.add(comp);
		compare comp1 = new compare(2, 19, "Prakhar");
		al.add(comp1);
		compare comp2 = new compare(3, 25, "Yash");
		al.add(comp2);

		Collections.sort(al);
		Iterator<compare> i = al.iterator();
		while(i.hasNext()){
			compare ee = (compare)i.next();
			System.out.println(ee.age +" "+ ee.name + " " +ee.no);
		}
	}
}
