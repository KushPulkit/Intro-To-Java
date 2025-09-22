//this program explored call by reference in java, by passing an object as a parameter into a method
class Test{
	int a,b;
	Test(int i,int j){
		a = i;
		b = j;
	}
	//pass an object
	void math(Test o){
		o.a*=2;
		o.b/=2;
	}
}
class CallByRefDemo{
	public static void main(String args[]){
		Test ob=new Test(15,20);
		System.out.println("ob.a and ob.b before call: "+ob.a+" "+ob.b);
		ob.math(ob);
		System.out.println("ob.a and ob.b after call: "+ob.a+" "+ob.b);
	}
}