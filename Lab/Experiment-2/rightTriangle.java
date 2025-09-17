import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Pulkit Kush, 24csu166");
		System.out.println("Enter height of triangle");
		int h=sc.nextInt();
		int temp=h-1;
		for(int i=1;i<=h;i++){
			for(int j=1;j<=h;j++){
				if(j>temp)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			temp--;
			System.out.println("");
		}
	}
}