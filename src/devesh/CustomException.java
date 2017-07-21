package devesh;

public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	CustomException() {
		// TODO Auto-generated constructor stub
		System.out.println("InvalidNumberException");
	}
	CustomException(String s){
		System.out.println(s);
	}
}
