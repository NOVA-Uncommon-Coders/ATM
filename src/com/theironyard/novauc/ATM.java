package com.theironyard.novauc;

import java.util.Scanner;

public class ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static Customer customer = new Customer();


    public static void main(String[] args) throws Exception {
	// write your code here

        System.out.println("Welcome, customer");

        customer.choosepin_number();
        customer.chooseOption();
        customer.chooseResponse();

    }
}
