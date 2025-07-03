package org.example;

public class BankAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;

    public void deposit(String accNumber, double balance){
        this.balance += balance;
    }

    public void withdraw(){
        this.balance -= balance;
    }

    public void displayInfo(){
        System.out.print("Account Number: " + this.accNumber);
        System.out.print("Account Holder: " + this.accHolderName);
        System.out.print("Available balance: $" + this.balance);
    }

    public String getAccNumber(){
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
