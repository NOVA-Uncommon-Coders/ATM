package com.theironyard.novauc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int balance = 500;
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        if (name.equals("") ) {
            throw new Exception("invalid name response");
        } else {
            System.out.println("Welcome, " + name);
        }


        System.out.println("would you like to check a balance, make a withdrawl or cancel?");
        String prompt = scanner.nextLine();
        if (prompt.equalsIgnoreCase("check a balance")) {
            System.out.println("your balance is " + balance);
        }
        else if (prompt.equalsIgnoreCase("cancel")) {
            System.out.println("thank you and come again ");
        }
        else {
            System.out.println("How much would like to withdraw?");
            String withdrawl = scanner.nextLine();
            int withdrawAmount = Integer.valueOf(withdrawl);
            if (balance< withdrawAmount){
                throw new Exception("balence exceeds amount available");
            }
            else {
                balance = balance - withdrawAmount;
                System.out.println("please take your cash");
                System.out.println("your new balence is " + balance);
            }
        }
    }
}






















