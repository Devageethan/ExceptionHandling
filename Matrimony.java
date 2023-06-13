package exceptionhandling;
import java.util.*;
public class Matrimony {
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter the age");
				try {
					eligible(s.nextInt());
				}catch(Noteligible e) {
					e.printStackTrace();
				}
			}
			public static void eligible(int age) throws Noteligible {
				if(age>=21) {
				System.out.println("congrats");
			}else {
				throw new Noteligible();
			}
			}
}
