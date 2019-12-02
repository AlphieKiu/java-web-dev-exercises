package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class BankAccount {

    //BankAccount "has a" (instance variable)
    private double balance;
    private int accountNo;
    private static int nextAccountNumber = 1000;

    //constructor: creating an object by assigning values to each instance variable
    public BankAccount(double balance) {
        this.balance = balance;
        this.accountNo = nextAccountNumber;
        this.nextAccountNumber++;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public boolean withdrawal(double amount) {
        if (amount < (this.balance-10) && amount > 0) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }

    public boolean deposit (double amount) {
        if (amount > 0 ) {
            this.balance = this.balance + amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNo=" + accountNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNo == that.accountNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }

    public static void main (String[] args) {
        BankAccount alphiesAcc= new BankAccount(1000);
        System.out.println(alphiesAcc);
        alphiesAcc.withdrawal(100);
        System.out.println(alphiesAcc);
        System.out.println(alphiesAcc.withdrawal(1000));
        System.out.println(alphiesAcc);
    }
}
