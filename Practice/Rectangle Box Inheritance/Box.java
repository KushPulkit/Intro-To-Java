class Box extends Rectangle{
	private double height;
	Box(){
		super(-1,-1);
		height=-1;
	}
	Box(double l,double w,double h){
		super(l,w);
		height=h;
	}
	void setDimension(double l,double w,double h){
       super.setDimension(l,w);
       height = h;
	}
	double getHeight(){
		return height;
	}
	double area(){
		return 2*(getLength()*getWidth() + getWidth()*getHeight() + getHeight()*getLength());
	}
	double volume(){
		return getLength()*getWidth()*getHeight();
	}
	void print(){
		System.out.println("Area of Box: "+area());
		System.out.println("Volume of Box: "+volume());
	}
}