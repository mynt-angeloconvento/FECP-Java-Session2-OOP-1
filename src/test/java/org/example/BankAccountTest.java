package org.example;

import org.junit.jupiter.api.*;

class BankAccountTest {

    @Test
    void depositValidAmount() {
        BankAccount account = new BankAccount("12345", "Test User", 0.0);
        account.deposit(100.0);
        Assertions.assertEquals(100.0, account.getBalance());
    }

    @Test
    void depositInvalidAmount() {
        BankAccount account = new BankAccount("12345", "Test User", 0.0);
        account.deposit(-50.0);
        Assertions.assertEquals(0.0, account.getBalance());
    }

    @Test
    void withdrawValidAmount() {
        BankAccount account = new BankAccount("12345", "Test User", 200.0);
        account.withdraw(50.0);
        Assertions.assertEquals(150.0, account.getBalance());
    }

    @Test
    void withdrawInvalidAmount() {
        BankAccount account = new BankAccount("12345", "Test User", 100.0);
        account.withdraw(-20.0);
        Assertions.assertEquals(100.0, account.getBalance());
    }

    @Test
    void withdrawExceedsBalance() {
        BankAccount account = new BankAccount("12345", "Test User", 100.0);
        account.withdraw(150.0);
        Assertions.assertEquals(100.0, account.getBalance());
    }

    @Test
    void getAccNumber() {
        BankAccount account = new BankAccount("98765", "Test User", 0.0);
        Assertions.assertEquals("98765", account.getAccNumber());
    }

    @Test
    void createAccountWithoutDeposits() {
        BankAccount account = new BankAccount("55555", "Test User", 0.0);
        Assertions.assertEquals(0.0, account.getBalance());
    }

    @Test
    void displayInfo() {
        BankAccount account = new BankAccount("12345", "Test User", 100.0);
        String expectedInfo = "Account Number: 12345\nAccount Holder: Test User\nAvailable Balance: 100.0";
        Assertions.assertEquals(expectedInfo, account.displayInfo());
    }
}