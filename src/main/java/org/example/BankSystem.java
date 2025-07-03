package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {

    public static void createAccount(ArrayList<BankAccount> bankAccounts, String accNumber, String accHolderName, double initialBalance) {
        bankAccounts.add(new BankAccount(accNumber, accHolderName, initialBalance));
    }

    public static void viewAllAccounts(ArrayList<BankAccount> bankAccounts) {
        if (bankAccounts.isEmpty()) {
            System.out.println("No bank accounts found.");
            return;
        }
        System.out.println("--- Accounts ---");
        for (int i = 0; i < bankAccounts.size(); i++) {
            System.out.println((i + 1) + ". ");
            bankAccounts.get(i).displayInfo();
        }
    }

    public static void checkBalance(ArrayList<BankAccount> bankAccounts, String accNumber) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getAccNumber().equals(accNumber)) {
                System.out.println("Available Balance: " + bankAccounts.get(i).getBalance());
            }
        }
    }

    public static void deposit(ArrayList<BankAccount> bankAccounts, String accNumber, double amount) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getAccNumber().equals(accNumber)) {
                bankAccounts.get(i).deposit(amount);
            }
        }
    }

    public static void withdraw(ArrayList<BankAccount> bankAccounts, String accNumber, double amount) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getAccNumber().equals(accNumber)) {
                System.out.println("Available Balance: " + bankAccounts.get(i).getBalance());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bank Menu ===");
        System.out.println("1. Create Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Check Balance");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");

        while (true) {
            System.out.println();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String accHolderName = scanner.nextLine();
//                    System.out.print("Initial Deposit? (Yes/No): ");
//                    String willDeposit = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double initialBalance = scanner.nextDouble();
                    createAccount(bankAccounts, accNumber, accHolderName, initialBalance);
                    break;
                case 2:
                    viewAllAccounts(bankAccounts);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    accNumber = scanner.nextLine();
                    checkBalance(bankAccounts, accNumber);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    accNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    deposit(bankAccounts, accNumber, amount);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("--- Thank you! ---");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}