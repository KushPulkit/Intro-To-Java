class widthCircle extends Shape{
	double radius;

	widthCircle(double r){
		radius = r;
	}
	double getArea(){
		return 3.14*radius*radius;
	}
}