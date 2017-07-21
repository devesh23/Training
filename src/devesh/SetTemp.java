package devesh;

import java.util.HashSet;

public class SetTemp {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet<>();
		hashSet.add(23);
		hashSet.add('a');
		hashSet.add("ajay");
		hashSet.add(22.43);
		hashSet.add(true);
		hashSet.add(null);
		System.out.println(hashSet);
	}
}
