package Seminar2;

public class BankAccount {
    private String name;
    private double balance;

    private static final int INTEREST_RATE = 5;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    BankAccount account1 = new BankAccount("John", 1000);
    BankAccount account2 = new BankAccount("Jane", 2000);

}
