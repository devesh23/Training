package devesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class com implements Comparator<Integer>{
	int a;
	int b;
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if((int)o1<(int)o2)
			return 1;
		else if((int)o1>(int)o2)
			return -1;
		else
			return 0;
	}
}

public class ArrayListTemp {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(4);
		al.add(9);
		al.add(15);
		al.add(0);
		System.out.println(al);
		Collections.sort(al,new com());
		System.out.println(al);
	}
}
