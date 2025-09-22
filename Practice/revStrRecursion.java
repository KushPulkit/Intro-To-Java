import java.util.*;
class test{
	String rev(String s){
	if(s.length()==1)
		return s;
	else
        return rev(s.substring(1))+s.charAt(0);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		test ob=new test();
		System.out.println("Enter your string");
		String str = sc.nextLine();
        System.out.println("Reversed is "+ob.rev(str));
	}
}