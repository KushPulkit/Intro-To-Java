import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Pulkit Kush, 24csu166");
		System.out.println("Enter a,b,c in \"ax^2 + bx + c = 0\"");
		int a,b,c;
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		double D=b*b-4*a*c;
		if(D>=0){
			System.out.println("Roots are "+(-b+Math.sqrt(D))/2+" , "+(-b-Math.sqrt(D))/2);
		}
		else
			System.out.println("Roots are "+(-b/2+" "+"(root("+(-1*D)+")/2)*i"+" , "+(-b+" "+"(-root("+(-1*D)+")/2)*i")));
	}
}