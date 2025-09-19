import java.util.*;
class VehicleApp{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Pulkit, 24csu166");
    System.out.println("Enter number N (number of tyres): ");
    int N=sc.nextInt();
    switch(N){
    case 2:
    	Bike bike=new Bike();
    	bike.display();
    	break;
    case 4:
    	Car car=new Car();
    	car.display();
    	break;
    default:
    	Vehicle v=new Vehicle();
    	v.display();
    	break;
    }
	}
}