import java.util.*;
class Shape{
   void display(){
   	System.out.println("This is shape");
   }
}
class Rectangle{
   void display(){
   	System.out.println("This is Rectangular shape");
   }
   void isRec(){
   	System.out.println("Square is Rectangle");
   }
}
class Circle{
   void display(){
   	System.out.println("This is Circular shape");
   }
}
class Square extends Rectangle{
public static void main(String args[]){
	System.out.println("Pulkit ,24csu166");
	Shape ob1=new Shape();
	Rectangle ob2=new Rectangle();
	Circle ob3=new Circle();
	Square ob4=new Square();
	ob1.display();
	ob2.display();
	ob3.display();
	ob4.isRec();
}
}