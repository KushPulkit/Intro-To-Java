import java.util.*;
class Circle{
	double radius;
	public void setRadius(){
    radius=2.0;
	}
	public void getradius(){
    System.out.println("Radius: "+radius);
	}
	double findArea(){
		double area=3.14*radius*radius;
		return area;
	}
	void displayArea(double area){
		System.out.println("Area is "+area);
	}
}
class CircleDemo2{
	public static void main(String args[]){
		Circle c=new Circle();
		c.setRadius();
		c.getradius();
		double area = c.findArea();
		c.displayArea(area);
	}
}