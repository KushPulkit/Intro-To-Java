public class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    void withdraw(double amount) {
        if (balance - amount >= 0)
            balance -= amount;
        else
            System.out.println("Cannot go lower than Zero");
    }
}
