package devesh;

import java.io.IOException;

public class ThrowsException {
	static void m() {
		try{
			int a =20/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			try{
				String s = null;
				System.out.println(s.length());
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
		}
		System.out.println("Code after finally executed");
	}

	public static void main(String[] args) {

		m();
	}
}