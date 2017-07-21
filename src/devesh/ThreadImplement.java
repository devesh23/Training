package devesh;

public class ThreadImplement extends Thread{
	public static int count = 1;  
	@Override
	public void run(){
		for(int i=1;i<1000;i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ThreadImplement implement = new ThreadImplement();
		ThreadImplement implement1 = new ThreadImplement();
		ThreadImplement implement2 = new ThreadImplement();
		implement.start();implement1.start();implement2.start();
	}
}
