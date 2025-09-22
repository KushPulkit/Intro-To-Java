import java.util.*;
class multiplyTable{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int a=sc.nextInt();
		System.out.println("For:");
		for(int i=1;i<=10;i++){
			System.out.println(a+" x "+i+" = "+a*i);
		}
		int j=1;
		System.out.println("While:");
		while(j<=10){
			System.out.println(a+" x "+j+" = "+a*j);
			j++;
		}
        System.out.println("Do-While:");
		int m=1;
		do{
			System.out.println(a+" x "+m+" = "+a*m);
			m++;
		}while(m<=10);
	}
}