package devesh;

import java.util.PriorityQueue;

public class PrioQue {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue<>();
		p.add(10);
		p.add(30);
		p.add(20);
		p.add(50);
		p.add(80);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		p.poll();
		System.out.println(p);
	}
}
