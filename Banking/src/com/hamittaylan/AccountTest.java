package com.hamittaylan;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {


    @Test
    public void deposit() {
        //fail("test has not been implemented");
        Account account = new Account("Tim","Yuce",1000.00,Account.CHECKING);
        double balance = account.deposit(200,true);
        assertEquals(1200.00,balance,0);
    }

    @Test
    public void withdraw() {
        fail("test has not been implemented");
    }


    @Test
    public void getBalance_deposit() {
        //fail("test has not been implemented");
        Account account = new Account("Tim","Yuce",1000.00,Account.CHECKING);
        double balance = account.deposit(200,true);
        assertEquals(1200.00,balance,0);
    }

    @Test
    public void getBalance_withdraw() {
        //fail("test has not been implemented");
        Account account = new Account("Tim","Yuce",1000.00,Account.CHECKING);
        double balance = account.withdraw(200,true);
        assertEquals(800.00,balance,0);
    }

    @Test
    public void isChecking_true()
    {
        Account account = new Account("Tim","Yuce",1000.00,Account.CHECKING);
        assertTrue(account.isChecking());

    }



}