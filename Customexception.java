package exceptionhandling;

import java.sql.SQLException;
public class Customexception {
				public static void main(String[] args) {
					System.out.println("hi i am main");
					try {
						System.out.println("hello");
						m1();
						System.out.println("234");
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("handle bye main");
					}
					
				}
				public static void m1()throws Exception{
					System.out.println("hi i am m1");
					m2();
				}
				public static void m2()throws Exception {
					System.out.println("hi i am m2");
					throw new SQLException();
				}
}



		
	

