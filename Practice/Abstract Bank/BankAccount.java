abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double money) {
        balance += money;
        System.out.println("Deposited Money: " + money + ", New Balance: " + balance);
    }

    abstract void withdraw(double amount);
}
