package exceptionhandling;

public class CustomException1 extends Throwable {
		String msg="hi something went wrong";
		public String getmessage() {
			return msg;
		}
}
