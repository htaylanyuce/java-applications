package com.hamittaylan;

public class Account {


    private String firstName;
    private String lastName;
    private double balance;
    private int typeOfAccount;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;


    public Account(String firstName, String lastName, double balance, int typeOfAccount){

        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfAccount = typeOfAccount;

    }
    public double deposit(double amount, boolean branch)
    {
        this.balance += amount;
        return balance;
    }
    public double withdraw(double amount, boolean branch)
    {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isChecking() {
        return this.typeOfAccount == CHECKING;
    }
}