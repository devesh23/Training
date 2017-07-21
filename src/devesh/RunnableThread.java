package devesh;

public class RunnableThread implements Runnable{
	@Override
	public void run(){
		System.out.println("Thread Implemented using runnable");
	}
	public static void main(String[] args) {
		RunnableThread f = new RunnableThread();
		Thread t = new Thread(f);
		t.start();
	}
}
