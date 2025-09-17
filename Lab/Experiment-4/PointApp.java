import java.util.*;

class PointApp {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("Pulkit Kush, 24csu166");
		System.out.println("Enter x1 , y1:");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();

		System.out.println("Enter x2 , y2:");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();

		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);

		System.out.println("Point 1: ");
		p1.display();
        System.out.println("Point 2: ");
		p2.display();

		System.out.println("Distance between p1 and p2: "+Point.distance(p1,p2));
	}
}