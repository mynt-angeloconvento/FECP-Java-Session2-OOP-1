package org.example;

public class BankAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;

    public BankAccount(String accNumber, String accHolderName, double balance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Updated Balance: $" + this.balance);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Updated Balance: $" + this.balance);
    }

    public void displayInfo() {
        System.out.println("Account Number: " + this.accNumber);
        System.out.println("Account Holder: " + this.accHolderName);
        System.out.println("Available Balance: $" + this.balance);
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
}
