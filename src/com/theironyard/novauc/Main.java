package com.theironyard.novauc;

import java.util.Scanner;

import static java.lang.System.*;


public class Main {
    public static double availableBal = 2357;
    public static double totalBal = 2357;
    public static Scanner scanner = new Scanner(in);
    private static Scanner input;


    public static void main(String[] args) throws Exception {
        // write your code here


        boolean run = true;
        while (run) {

            System.out.println("Welcome, Customer.");
            out.println(" What is your name?");

            Scanner scanner = new Scanner(in);


            String name = scanner.nextLine();

            if (name.isEmpty()) {
                throw new Exception("Enter Name");
            } else {
                System.out.println("Welcome ," + name);

            }
            System.out.println("What would you like to do? 1. Display Balance 2. Withdrawal 3. Cancel");
            String transaction = scanner.nextLine();
            // make a decision based on what they input
            // if statement to make the decision
            if (transaction.equalsIgnoreCase("1")) {
                System.out.println("Available Balance is " + availableBal);
            } else if (transaction.equalsIgnoreCase("2")) {
                System.out.println("Select an amount to withdraw");
                String withdraw = scanner.nextLine();
                double withdrawAmount = Double.valueOf(withdraw);
                availableBal = availableBal - withdrawAmount;
                if (withdrawAmount > availableBal) {
                    throw new Exception("Insufficient Funds.");
                } else {
                    System.out.println("Take your money. Your new balance is " + availableBal);
                    //          }else if (transaction.equalsIgnoreCase("3"))
                }
            } else if (transaction.equalsIgnoreCase("3")) {
                System.out.println("Thank you and please come again!");
            }


            // prompt for amount to withdraw
            // store the amount that they enter in a variable
            // do math on withdraw amount vs current balance
            // store new balance
            // print line saying take your money your balance is ...


                //              System.out.println("Thank you and please come again!");


//            System.out.println("Select an account 1. Checking 2. Savings");
//            String account = scanner.nextLine();
//
//            System.out.println("Current Balance: $2357.00");
//
//
//            System.out.println("Select Cancel or another transaction");
//            String select = scanner.nextLine();
//
//            if (select.equalsIgnoreCase("cancel")) {
//                System.out.println("Thank you and please come again!");
//            } else if (select.equalsIgnoreCase("another transaction")) {
//                System.out.println("1. Display Balance 2. Withdrawal 3. Cancel");
//            } else {
//                throw new Exception("Invalid transaction.");
//            }
//            System.out.println("Select an amount to withdraw.");
//            String withdraw = scanner.nextLine();
//


        }
    }
}


