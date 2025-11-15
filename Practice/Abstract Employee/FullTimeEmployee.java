class FullTimeEmployee extends Employee {
	double fixedPay;

	FullTimeEmployee(double pay){
       fixedPay = pay ;
	}
    double calculateSalary(){
    	return fixedPay;
    }
}