package devesh;

public class DaemonThread extends Thread{
	public void run(){
		System.out.println("I am Daemon");
	}
	public static void main(String[] args){
		DaemonThread f = new DaemonThread();
		f.start();
		f.setDaemon(true);
		System.out.println(f.getPriority());
	}
}
