import java.util.*;
class Circle{
	double radius;
	double findArea(){
		double area=3.14*radius*radius;
		return area;
	}
	void displayArea(double area){
		System.out.println("Area is "+area);
	}
}
class CircleDemo{
	public static void main(String args[]){
		Circle c=new Circle();
		c.radius=2.0;
		double area = c.findArea();
		c.displayArea(area);
	}
}