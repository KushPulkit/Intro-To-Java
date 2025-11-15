import java.util.*;
class VehicleDemo {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brand and Model");
		String b = sc.nextLine();
		String m = sc.nextLine();

		Car ob = new Car(b,m);
		ob.display();
	}
}