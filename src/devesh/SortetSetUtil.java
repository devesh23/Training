package devesh;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortetSetUtil {
	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<>();
		s.add("Anil");
		s.add("Ani");
		s.add("An");
		s.add("A");
		System.out.println(s);
		System.out.println(s.headSet("Ani"));
		System.out.println(s.tailSet("Anil"));
		System.out.println(s.subSet("An","Ani"));
	}
}
