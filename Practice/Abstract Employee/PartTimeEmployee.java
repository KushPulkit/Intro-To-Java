class PartTimeEmployee extends Employee {
	double hours;
	double rate;

	PartTimeEmployee(double h, double r){
		hours = h ;
		rate = r ;
	}

	double calculateSalary(){
    	return hours*rate;
    }
}