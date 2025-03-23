package Seminar1;

public class BankAccount {
    private String accountHolder;

    private String accountNumber;

    private double balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance");
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        } else if(amount > this.balance) {
            System.out.println("Insufficient balance");
        }
        else {
            this.balance -= amount;
        }
    }
}

