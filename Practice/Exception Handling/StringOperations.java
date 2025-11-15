import java.util.*;
import java.lang.Throwable;
class StringOperations {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s = null;
		try{
			int len = s.length();
		}
		catch(NullPointerException e){
			System.out.println(e);
			System.out.println("Cannot find length of a null string!");
		}
		System.out.println("Rest of code!!!\nPulkit, 24csu166");
	}
}