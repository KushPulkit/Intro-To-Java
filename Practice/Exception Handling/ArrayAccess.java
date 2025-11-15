import java.util.*;
import java.lang.Throwable;
class ArrayAccess {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter index and its value: ");
		int index = sc.nextInt();
		try{
			arr[index]=sc.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Oops! Index is Out of Array!!!");
		}
		System.out.println("Rest of Code!!!\nPulkit, 24csu166");
	}
}