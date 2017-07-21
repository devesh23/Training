package devesh;

public class CheckException {
	static void m() throws Exception{
		throw new Exception();
	}
	public static void main(String[] args) {
		try{
			m();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
