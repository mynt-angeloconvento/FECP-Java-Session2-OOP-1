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
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
            return;
        }
        this.balance += amount;
        System.out.println("Updated Balance: $" + this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount. Please enter a positive amount.");
            return;
        }
        if (amount >= this.balance) {
            System.out.println("Invalid withdraw amount. Please enter an amount less than your current balance.");
            return;
        }
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
