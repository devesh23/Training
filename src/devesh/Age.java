package devesh;

import java.util.Scanner;

public class Age {
	int age;
	
	Age(){
		age = 0;
	}
	
	void insert(){
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		try{
			if(age>=18){
				System.out.println("Eligible for vote");
			}
			else 
				throw new ArithmeticException();
		}
		catch(Exception e){
			System.out.println("Error " + e);
		}
	}
	public static void main(String[] args) {
		Age a = new Age();
		a.insert();
	}
}
