import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length, width, height");
		double l=sc.nextDouble();
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		
		System.out.println("This is rectangle class: ");
		Rectangle rec = new Rectangle(l,w);
        rec.print();

        for(int i=0;i<14;i++)
        	System.out.print("--");

        Box ob=new Box(l,w,h);
        System.out.println("\nThis is box class: ");
        ob.print();
	}
}