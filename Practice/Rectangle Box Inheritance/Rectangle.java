class Rectangle {
	private double length;
	private double width;
	Rectangle(){
		length = -1;
		width = -1;
	}
	Rectangle(double l,double w){
    length = l;
    width = w;
	}
	void setDimension(double l,double w){
    length = l;
    width = w;
	}
	double getLength(){
		return length;
	}
	double getWidth(){
		return width;
	}
	double area(){
		return getWidth()*getLength();
	}
	double perimeter(){
		return 2*(getLength()+getWidth());
	}
	void print(){
		System.out.println("Area of Rectangle: "+area());
		System.out.println("Perimeter of Rectangle: "+perimeter());
	}
}