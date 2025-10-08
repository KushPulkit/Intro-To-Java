class Main {
	public static void main(String args[]){
       double radius = 1.0;
       System.out.println("Pulkit, 24csu166");
       ResizableCircle rc = new ResizableCircle(radius);
       System.out.println("Perimeter: "+rc.getPerimeter());
       System.out.println("Area: "+rc.getArea());
       System.out.println("Resizing Circle by 100%!!!");
       rc.resize(100);
       System.out.println("Perimeter: "+rc.getPerimeter());
       System.out.println("Area: "+rc.getArea());
	}
}