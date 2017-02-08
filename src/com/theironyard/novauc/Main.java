package com.theironyard.novauc;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);





        System.out.println("What would you like to do?[1.Check balance 2.Withdtraw funds 3.Cancel]");
        String options = scanner.nextLine();

        if (options.equalsIgnoreCase("Check balance")) {
            System.out.println("zero balance");

        } else if (options.equalsIgnoreCase("Withdraw funds")) {
            System.out.println("Only in Denominations of Twenty");

        } else if (options.equalsIgnoreCase("Cancel")) {
            System.out.println("Cancel...");

            System.out.println("Thank you and please come again.");

            Scanner scannner = new Scanner(System.in);



            System.out.println("Thank you," + name);




        }

    }
}










//




