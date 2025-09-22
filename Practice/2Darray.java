import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int m1[][]=new int[r1][c1];
        System.out.println("Enter elements of matrix1");
        for(int i=0;i<r1;i++){
        	for(int j=0;j<c1;j++){
        		m1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Enter rows and columns of matrix2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int m2[][]=new int[r2][c2];
        System.out.println("Enter elements of matrix2");
        for(int i=0;i<r2;i++){
        	for(int j=0;j<c2;j++){
        		m2[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Matrix 1:");
        for(int i=0;i<r1;i++){
        	for(int j=0;j<c1;j++){
        		System.out.print(m1[i][j]+" ");
        	}
        	System.out.println("");
        }
       System.out.println("Matrix 2:");
        for(int i=0;i<r2;i++){
        	for(int j=0;j<c2;j++){
        		System.out.print(m2[i][j]+" ");
        	}
        	System.out.println("");
        }
        if(r1==r2 && c1==c2){
        System.out.println("Addition:");
        for(int i=0;i<r2;i++){
        	for(int j=0;j<c2;j++){
        		System.out.print(m1[i][j]+m2[i][j]+" ");
        	}
        	System.out.println("");
        }
        System.out.println("Subtraction:");
        for(int i=0;i<r2;i++){
        	for(int j=0;j<c2;j++){
        		System.out.print(m1[i][j]-m2[i][j]+" ");
        	}
        	System.out.println("");
        }
    }
    else 
    	System.out.println("Addition/Subtraction not possible");
    }
}
