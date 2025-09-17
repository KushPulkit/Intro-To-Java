import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Pulkit Kush, 24csu166");
		System.out.println("Enter Height of Pyramid: ");
		int h=sc.nextInt();
		int p=2*h-1; int t=h-2;
		for(int i=0;i<h;i++){
			for(int j=0;j<p;j++){
				if(j<=t || p-1-j<=t)
					System.out.print("   ");
				else
					System.out.print(" * ");
			}
			t--;
			System.out.println("");
		}
	}
}