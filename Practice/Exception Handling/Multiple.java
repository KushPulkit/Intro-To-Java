import java.util.*;
import java.lang.Throwable;
class MultipleExceptions {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter index you want to input: ");
		int index = sc.nextInt();
		System.out.println("Enter its value: ");
		int value = sc.nextInt();
		System.out.println("Enter the divisor: ");
		int div = sc.nextInt();
		try{
        arr[index]=value/div;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Numeric Exception!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Array Index Exception");
		}
		System.out.println("Rest of Code!!!\nPulkit, 24csu166");
	}
}