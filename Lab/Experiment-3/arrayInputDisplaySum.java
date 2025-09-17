import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Pulkit Kush, 24csu166");
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter values in array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
		}
		System.out.print("Display: ");
		int sum=0;int altSum1=0; int altSum2=0;
		for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        sum=sum+arr[i];
        if(i%2==0)
        altSum1+=arr[i];
        else
        altSum2+=arr[i];
		}
		System.out.println("\nSum is "+sum);
		System.out.println("Alternative Sums are "+altSum1+" and "+altSum2);
	}
}