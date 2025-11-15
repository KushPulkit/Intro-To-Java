import java.util.*;
import java.lang.Throwable;
class NumberConversion {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = sc.next();
		try{
			int num = Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println(e);
			System.out.println("You entered a non-numeric input!");
		}
		System.out.println("Rest of Code!!!\nPulkit, 24csu166");
	}
}