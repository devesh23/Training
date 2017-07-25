package devesh;

import java.util.PriorityQueue;

public class PriorityQ {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue<>();
		p.offer("a");
		p.add("b");
		p.add(new Integer(20));
		System.out.println(p);
		}
}
