//Pulkit, 24csu166
class Box {
	float width;
	float height;
	float depth;
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	Box(float w,float h,float d){
		width = w;
		height = h;
		depth = d;
	}
	Box(Box copy){
		width = copy.width;
		height = copy.height;
		depth = copy.depth;
	}
	float getWidth(){
    return width;
	}
	float getHeight(){
	return height;
	}
	float getDepth(){
	return depth;
	}
	void setDimension(float w, float h, float d){
		width = w;
		height = h;
		depth = d;
	}
	float volume(){
		return width*depth*height;
	}
}