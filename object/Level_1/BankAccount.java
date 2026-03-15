import java.util.Scanner;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        b.accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        b.accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        b.balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double d = sc.nextDouble();
        b.deposit(d);

        System.out.print("Enter Withdraw Amount: ");
        double w = sc.nextDouble();
        b.withdraw(w);

        b.displayBalance();
    }
}