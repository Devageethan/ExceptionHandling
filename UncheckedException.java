package exceptionhandling;

public class UncheckedException {
			public static void main(String[] args) {
				System.out.println("hi i am main");
				try {
					System.out.println("hello i am try");
					m1();
				}catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
					System.out.println("i am the exception");
				}
			}
			static void m1() {
				System.out.println("i am m1");
				m2();
			}
			static void m2() {
				System.out.println("i am m2");
				throw new ArrayIndexOutOfBoundsException();
			}
}
