package devesh;
import devesh.CustomException;
public class Custom {
	static void chk(int no){
		try{
			if(no < 0){
				throw new CustomException("Wrong");
			}
		}
		catch(CustomException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		chk(-2);
	}
}
