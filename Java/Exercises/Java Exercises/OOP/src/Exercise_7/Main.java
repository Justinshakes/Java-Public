package Exercise_7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create two account objects
        Account account1 = new Account("Justin", 5000);
        Account account2 = new Account("Calen", -2000);

        // Add the accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);


        bank.printAccounts();

        System.out.println("\nAfter depositing 1000 into Justin's account:");
        // Deposit 1000 into Justin's account using the bank's method
        bank.depositMoney(account1, 1000);
        // Print updated details of Justin's account
        account1.printDetails();

        System.out.println("No transaction in Calen's account:");
        // Print details of Calen's account
        account2.printDetails();

        System.out.println("After withdrawing 500 from Justin's account:");
        // Withdraw 500 from Justin's account using the bank's method
        bank.withdrawMoney(account1, 500);
        // Print updated details of Justin's account
        account1.printDetails();
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add an account to the bank's list of accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Remove an account from the bank's list of accounts
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Deposit money into an account by calling the account's deposit method
    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    // Withdraw money from an account by calling the account's withdraw method
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    public void printAccounts(){
        for(Account A : accounts){
            A.printDetails();
        }
    }

    // Get the list of accounts in the bank
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}

class Account {
    private String name;
    private double accountTotal;

    // Constructor to initialize account details
    Account(String name, double accountTotal) {
        this.name = name;
        this.accountTotal = accountTotal;
    }

    // Deposit money into the account
    public void deposit(double depositAmount) {
        accountTotal += depositAmount;
    }

    // Withdraw money from the account
    public void withdraw(double withdrawalAmount) {
        accountTotal -= withdrawalAmount;
    }

    // Print the account details
    public void printDetails() {
        System.out.println("Account name: " + name + ", Account total: " + accountTotal);
    }
}
