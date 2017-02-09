package com.theironyard.novauc;

import java.util.Scanner;

public class ATM {


        public static Scanner scanner = new Scanner(System.in);
        public static Customer customer = new Customer();


    public static void main(String[] args) throws Exception {


        System.out.println("Welcome, customer");



        customer.chooseName();
        customer.chooseBalance();
    }
}

