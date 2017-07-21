package devesh;

class First {
	public static synchronized void print(int n){
		for(int i=1;i<10;i++){
			try{
				Thread.sleep(1000);
				System.out.println(n*i);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
class two extends Thread{
	
	public void run(){
		First.print(2);
	}
}
class six extends Thread{
	public void run(){
		First.print(6);
	}
}
public class Sync{
	public static void main(String[] args) {
		First t = new First();
		two t1 = new two();
		six s = new six();
		t1.start();s.start();
	}
}