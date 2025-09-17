import java.util.*;
class test{
	void pattern(int h){
    for(int i=0;i<h;i++) {
        for(int j=0;j<h-i-1;j++) {
            System.out.print(" ");
        }
        for(int j=0;j<h;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
	}

	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Pulkit Kush, 24csu166");
    System.out.println("Enter side length of rhombus");
    int h=sc.nextInt();
    test ob=new test();
    ob.pattern(h);

	}
}