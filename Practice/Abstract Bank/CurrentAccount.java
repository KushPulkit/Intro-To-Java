public class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    void withdraw(double amount) {
        if (balance - amount >= -10000)
            balance -= amount;
        else
            System.out.println("Cannot go lower than -10,000");
    }
}
