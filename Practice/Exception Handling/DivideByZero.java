import java.util.*;
import java.lang.Throwable;
class DivideByZero {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try{
			int c = a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Oops! Divide by Zero!");
		}
		System.out.println("Rest of Code!!!\nPulkit,24csu166");
	}
}