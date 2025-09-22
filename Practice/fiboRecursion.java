import java.util.*;
class test{
	int fibo(int x){
		if(x==0)
			return 0;
		if(x==1)
			return 1;
		else
			return fibo(x-2)+fibo(x-1);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number of Fibonacci you want: ");
		int a=sc.nextInt();
		test ob = new test();
        for(int i=1;i<=a;i++){
        System.out.print(ob.fibo(i)+" ");
        }
	}
}