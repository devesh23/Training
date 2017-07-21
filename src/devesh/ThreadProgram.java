package devesh;

public class ThreadProgram implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			try{
			if(i==7)
				Thread.currentThread().join();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println( i);
		}
	}
	public static void main(String[] args) throws InterruptedException{
		ThreadProgram f1 = new ThreadProgram();
		Thread t = new Thread(f1);
		t.setPriority(Thread.MAX_PRIORITY);
		ThreadProgram f2 = new ThreadProgram();
		Thread t1 = new Thread(f2);
		t1.setPriority(Thread.MIN_PRIORITY);
		ThreadProgram f3 = new ThreadProgram();
		Thread t2 = new Thread(f3);
		t.start();t1.start();t2.start();
		System.out.println(t.isAlive());
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
