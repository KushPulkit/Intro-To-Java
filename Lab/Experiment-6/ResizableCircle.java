interface Resizable{
	void resize(int percent);
}
class ResizableCircle extends Circle implements Resizable{
	ResizableCircle(double radius){
        super(radius);
	}
    public void resize(int percent){
       radius += (double)radius*(percent/100.0);
    }
}