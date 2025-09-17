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
		System.out.println("Enter element you want to find");
		int num=sc.nextInt();
		boolean found=false;
        for(int i=0;i<n;i++){
        	if(num==arr[i]){
        		System.out.println("Element found at index "+i);
        	    found = true;
        	    break;
	        }
        }
        if(found==false){
        	System.out.println("Element not present in the array");
        }
	}
}