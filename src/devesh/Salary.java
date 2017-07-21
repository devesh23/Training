package devesh;

import java.util.Scanner;

public class Salary {
	
	int basicSalary;
	String name;
	String designation;
	
	Salary(){
		basicSalary = 0;
		name = null;
		designation = null;
	}
	
	Salary(int basicSalary, String name, String designation){
	// Default Constructor;	
		this.basicSalary = basicSalary;
		this.name = name;
		this.designation = designation;
	}
	
	Salary insert(){
		
		int basicSalary;
		String name;
		String designation;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the basic Salary of Employee");
		basicSalary = s.nextInt();
		
		System.out.println("Enter the name of Employee");
		name = s.next();
		
		System.out.println("Enter the designation of Employee");
		designation = s.next();
		
		Salary temp = new Salary(basicSalary,name,designation);
		
		return temp;
	
	}
	
	void display(){
		double salary = 0.35*basicSalary + 1.5*basicSalary + basicSalary - 1000;
		System.out.println("Salary of the employee is " + salary);
	}
	
	public static void main(String[] args) {
		Salary ob1 = new Salary();
		ob1 = ob1.insert();
		ob1.display();
	}
}
