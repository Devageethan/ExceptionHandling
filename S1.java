package exceptionhandling;

public class S1 {
	public static void main(String[] args) {
		try {
			System.out.println("hi i am main");
			throw new CustomException1();
		} catch (CustomException1 e) {
			e.printStackTrace();
			e.getmessage();
		}
	}
}
