import java.util.*;
class test {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter values in array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
		}
		System.out.print("Display: ");
		for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
		}
		int unique[]=new int[n];
		int uniCount=0;
		// System.out.print("\nDuplicate Removed: ");
		for(int i=0;i<n;i++){
        boolean isDup=false;

        for(int j=0;j<uniCount;j++){
        	if(arr[i]==unique[j]){
        		isDup=true;
        		break;
        	}
        }

        if(!isDup){
        	unique[uniCount]=arr[i];
        	uniCount++;
        }
		}
		System.out.print("\nArray Without Duplicates: ");
		for(int i=0;i<uniCount;i++){
			System.out.print(unique[i]+" ");
		}
	}
}