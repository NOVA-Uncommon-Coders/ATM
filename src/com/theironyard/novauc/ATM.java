package com.theironyard.novauc;



public class ATM {
public static Customer cust1 = new Customer("alvin", 1000.0);
public static Balance balance = new Balance();


    public static void main(String[] args) throws Exception {
        cust1.prompt();
        cust1.menu();
        double  balance;

    }



}