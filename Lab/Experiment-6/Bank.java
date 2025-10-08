abstract class Bank {
	double balance;
	Bank(double balance){
    this.balance=balance;
	}
	abstract double getBalance();
}