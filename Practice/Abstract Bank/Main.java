import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acc no.");
        int acNo = sc.nextInt();
        System.out.println("Enter Balance, Deposit and Withdraw amount");
        double balance = sc.nextDouble();
        double deposit = sc.nextDouble();
        double withdraw = sc.nextDouble();

        SavingsAccount ob1 = new SavingsAccount(acNo, balance);
        ob1.deposit(deposit);
        ob1.withdraw(withdraw);
        System.out.println("Final Balance (Savings): " + ob1.balance);

        CurrentAccount ob2 = new CurrentAccount(acNo, balance);
        ob2.deposit(deposit);
        ob2.withdraw(withdraw);
        System.out.println("Final Balance (Current): " + ob2.balance);
    }
}
