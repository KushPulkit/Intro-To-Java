import java.util.*;
class BoxWeightDemo{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Pulkit, 24csu166");
    System.out.println("Enter width, height, depth and weight");
    float w = sc.nextFloat();
    float h = sc.nextFloat();
    float d = sc.nextFloat();
    float wid = sc.nextFloat();

    Box ob1 = new Box(w,h,d);
    Box ob2 = new Box(ob1);
    Box ob3 = new Box();
    System.out.println("This is Box class:");
    System.out.println("Parameterized: "+ob1.getWidth()+" "+ob1.getHeight()+" "+ob1.getDepth());
    System.out.println("Volume: "+ob1.volume());
    System.out.println("\nCopy Constructor: "+ob2.getWidth()+" "+ob2.getHeight()+" "+ob2.getDepth());
    System.out.println("Volume: "+ob2.volume());
    System.out.println("\nNon Parameterized: "+ob3.getWidth()+" "+ob3.getHeight()+" "+ob3.getDepth());
    System.out.println("Volume: "+ob3.volume());

    BoxWeight o1 = new BoxWeight(w,h,d,wid);
    BoxWeight o2 = new BoxWeight(o1);
    BoxWeight o3 = new BoxWeight();
    System.out.println("\nThis is BoxWeight class:");
    System.out.println("Parameterized: "+o1.getWidth()+" "+o1.getHeight()+" "+o1.getDepth());
    System.out.println("Weight: "+o1.displayWeight());
    System.out.println("\nCopy Constructor: "+o2.getWidth()+" "+o2.getHeight()+" "+o2.getDepth());
    System.out.println("Weight: "+o2.displayWeight());
    System.out.println("\nNon Parameterized: "+o3.getWidth()+" "+o3.getHeight()+" "+o3.getDepth());
    System.out.println("Weight: "+o3.displayWeight());
	}
}