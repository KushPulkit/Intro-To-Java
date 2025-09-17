import java.util.*;
class Area{
	int length; int breath;
	Area(int l,int b){
    length=l;
    breath=b;
	}
	int returnArea(){
		return length*breath;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Pulkit, 24csu166");
	System.out.println("Enter Length and Breath: ");
    int l=sc.nextInt();int b=sc.nextInt();
    Area ob=new Area(l,b);
    System.out.println("Area is "+ob.returnArea());
	}
}