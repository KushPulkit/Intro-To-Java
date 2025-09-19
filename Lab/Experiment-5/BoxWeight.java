//Pulkit, 24csu166
class BoxWeight extends Box{
    float weight;

    BoxWeight(){
    	super(-1,-1,-1);
    	weight = -1;
    }
    BoxWeight(float w, float h, float d, float wid){
    	super(w,h,d);
    	weight = wid;
    }
    BoxWeight(BoxWeight copy){
    	super(copy.width,copy.height,copy.depth);
    	weight = copy.weight;
    }
    float getWeight(){
    	return weight;
    }
    void setDimension(float w, float h, float d, float wid){
    super.setDimension(w,h,d);
    weight = wid;
    }
    float displayWeight(){
    	return weight;
    }
}