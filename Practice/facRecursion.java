import java.util.*;
class test{
	int fac(int x){
    if(x==0 || x==1)
    return 1;
    else
    return x*fac(x-1);
	}
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    test ob=new test();
    System.out.println("Enter your number: ");
    int a=sc.nextInt();
    System.out.println("Factorial is "+ob.fac(a));
	}
}