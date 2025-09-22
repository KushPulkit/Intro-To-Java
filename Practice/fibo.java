import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers of Fibnonacci series you want: ");
		int num=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i = 0; i<num ; i++){
        System.out.print(a+" ");
        c=a+b;
        a=b;
        b=c;
		}
	}
}