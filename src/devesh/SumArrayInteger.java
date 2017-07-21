package devesh;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayInteger {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < 4 ; i++){
			al.add(s.nextInt());
		}
		int sum = 0;
		Object[] ob = al.toArray();
		for(Object value : ob){
			sum = sum + (int) value;
		}
		System.out.println(sum);
	}
}
