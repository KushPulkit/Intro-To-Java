import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 3-digit number: ");
		int a=sc.nextInt();
		int unit=a%10;
		int tens=(a%100)/10;
		int hreds=a/100;
		System.out.println("Reverse is "+(unit*100+tens*10+hreds));
		System.out.println("Pulkit Kush, 24csu166");
    }
}