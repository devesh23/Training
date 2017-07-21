package devesh;

import java.util.Scanner;

public class Bank extends Thread{
	
	public static int amount;
	Bank(int amount){
		this.amount = amount;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int k = 1;
		while(k!=3)
		k = StartTransaction();
	}
	
	public synchronized void deposit(int n){
			System.out.println("Going for deposit");
			amount = amount + n;
			System.out.println("Deposit Done");
			notify();
	}
	
	public synchronized void withdraw(int n){
		System.out.println("Going for withdrawal");
		try{
			if( amount< n ){
				System.out.println("less amount for withdrawal");
				wait();
			}
			else{
				amount = amount - n;
				System.out.println("Withdrawal Done");
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
	
	int StartTransaction(){
		System.out.println("What do you want to do \n Press 1 for withdrawal \n Press 2 for deposit \n Press 3 for exit");
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		if(temp==1){
			Thread t1 = new Thread(){
				public void run(){
				 withdraw(15000);
				}
			};
			t1.start();
		}
		else{
			Thread t2 = new Thread(){
				public void run(){
					deposit(10000);
				}
			};
			t2.start();
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		Bank b = new Bank(10000);
		b.start();
	}
}
