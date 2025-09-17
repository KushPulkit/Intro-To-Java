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
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++){
        if(arr[i]>max)
        	max=arr[i];
        if(arr[i]<min)
        	min=arr[i];
		}
		System.out.println("\nMax is "+max+" Min is "+min);
	}
}