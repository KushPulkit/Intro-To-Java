import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Rectangle;");
        int l = sc.nextInt();
        System.out.println("Enter Radius of Circle;");
        double r = sc.nextDouble();
        Shape ob1 = new Rectangle(l);
        System.out.println("Rectangle Area: "+ob1.getArea());
        Shape ob2 = new widthCircle(r);
        System.out.println("Circle Area: "+ob2.getArea());
	}
}