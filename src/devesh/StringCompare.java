package devesh;

public class StringCompare {
	public static void main(String[] args) {
		String s1  = "Sameer";
		String s2  = new String("Sameer");
		String s3  = new String ("SAMEER");
		String s4  = "SAMEER";
		String s5  = "Sandeep";
		String s6  = "Sandesh";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s4.compareTo(s5));
		System.out.println(s6.compareTo(s5));
	}
}
