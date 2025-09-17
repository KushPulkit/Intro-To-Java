import java.util.*;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter your 3 digit number: ");
int a=sc.nextInt();
int unit=a%10;
int tens=(a%100)/10;
int hreds=a/100;
int sum=hreds+tens+unit; 
System.out.println("Sum of digits is "+sum);
System.out.println("Pulkit Kush, 24csu166");
}
}