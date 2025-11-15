import java.util.*;
class EmployeeDemo {
	public static void main(String args[]){
		System.out.println("Enter details: Name, Id, Department");
		Scanner sc=new Scanner(System.in);
		String n = sc.nextLine();
		int id = sc.nextInt();
		sc.nextLine();
		String dept = sc.nextLine();
		System.out.println("This is Employee Class: ");
		Employee ob1 = new Employee(n,id);
		ob1.displayDetails();
		for(int i = 0 ; i < 10 ; i++)
			System.out.print("--");
		System.out.println("\nThis is Manager Class: ");
		Manager ob2 = new Manager(n,id,dept);
		ob2.displayDetails();
	}
}