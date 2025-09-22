import java.util.*;
class test{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter values in array");
		boolean visited[]=new boolean[n];
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        visited[i]=false;
		}
		System.out.print("Display: ");
		for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<n;i++){
			if(visited[i])
				continue;
			int count=0;
			for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
            	count++;
            	visited[j]=true;
            }
			}

			System.out.println("Frequency Of "+arr[i]+" = "+count);
		}
	}
}