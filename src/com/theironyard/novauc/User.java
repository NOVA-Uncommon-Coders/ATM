package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/8/17.
 */
public class User {

    int checking;
    int savings;
    int balance;
    int withdraw;

    public int getWithdraw() {
        return withdraw;
    }
//I want to make a method that allows the user to enter any integer for withdraw and deposit (I haven't figured it out yet)
    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public User(int withdraw) {

        this.withdraw = withdraw;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getChecking() {
        return checking;
    }

    public void setChecking(int checking) {
        this.checking = checking;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }



    public User(int balance, int checking, int savings, int withdraw) {
        this.balance = checking + savings;
        this.checking = checking;
        this.savings = savings;












    }
}