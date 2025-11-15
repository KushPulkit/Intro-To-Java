class Rectangle extends Shape {
	int length;

	Rectangle(int l){
		length = l;
	}
	
	double getArea(){
    return length*length;
	}
}