class Area extends Shape {
	
    void RectangleArea(double l,double b){
        System.out.println("Area of Rectangle: "+(l*b));
    }

    void SquareArea(double s){
    	System.out.println("Area of Square: "+s*s);
    }

    void CircleArea(double r){
    	System.out.println("Area of Circle: "+(3.14*r*r));
    }
}