import java.util.*;
class Main {
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter fixed salary for Full Time Employee");
    double fixedPay = sc.nextDouble();
    System.out.println("Enter Hours worked by Part Time Employee");
    double hours = sc.nextDouble();
    System.out.println("Enter rate per hour");
    double rate = sc.nextDouble();

    Employee fte = new FullTimeEmployee(fixedPay);
    System.out.println("\nSalary of Full Time Employee: "+fte.calculateSalary());

    Employee pte = new PartTimeEmployee(hours,rate);
    System.out.println("\nSalary of Part Time Employee: "+pte.calculateSalary());
	}
}