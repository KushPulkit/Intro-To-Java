import java.util.*;
class Complex{
	static Scanner sc=new Scanner(System.in);
	double r1,i1,r2,i2;

	Complex(double a,double b,double c,double d){
    r1=a;
    i1=b;
    r2=c;
    i2=d;
	}

	void sum(){
    System.out.println("Sum: "+(r1+r2)+" + "+(i1+i2)+"i");
	}
	void diff(){
    System.out.println("Difference: "+(r1-r2)+" + "+(i1-i2)+"i");
	}
	void product(){
    System.out.println("Product: "+(r1*r2-i1*i2)+" + "+(r1*i2+r2*i1)+"i");
	}
	void display(){
		System.out.println("First: "+r1+" + "+i1+"i");
		System.out.println("Second: "+r2+" + "+i2+"i");
	}
	public static void main(String args[]){
    System.out.println("Pulkit Kush, 24csu166\nEnter First Complex Number: ");
    double r1=sc.nextDouble();   
	double i1=sc.nextDouble();
	System.out.println("Enter Second Complex Number: ");
	double r2=sc.nextDouble();
	double i2=sc.nextDouble();
	Complex ob=new Complex(r1,i1,r2,i2);
    ob.display();
    ob.sum();
    ob.diff();
    ob.product();
	}
}