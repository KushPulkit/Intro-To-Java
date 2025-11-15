import java.lang.Throwable;
import java.util.*;
class FinallyUse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try{
			int c = a/b;
			System.out.println("Output: "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Math Error!!!");
		}
		finally{
			System.out.println("Finally Runs Anyway!!!");
		}
		System.out.println("Rest of Code!!!\nPulkit,24csu166");
	}
}