import java.util.*;
class Point{
	//Pulkit Kush, 24csu166
double x; double y;

    Point(){
	x=0.0;
	y=0.0;
    }
    Point(double x1,double y1){
	x=x1;
	y=y1;
    }

    double getX(){
	return x;
    }
    void setX(double a){
    x=a;
    }
    double getY(){
	return y;
    }
    void setY(double a){
    y=a;
    }

    static double distance(Point p1, Point p2){
    double dx = p2.getX() - p1.getX();
    double dy = p2.getY() - p1.getY();
    return Math.sqrt(dx*dx + dy*dy);
    }

    void display(){

    System.out.printf("(%7.2f , %7.2f)\n",x,y);
 }
}