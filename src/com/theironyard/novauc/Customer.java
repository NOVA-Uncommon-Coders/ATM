package com.theironyard.novauc;


import java.util.Scanner;

import static com.theironyard.novauc.ATM.balance;

/**
 * Created by ANVIL_OCTOPUS on 2/8/17.
 */
public class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    Scanner input = new Scanner(System.in);
    Scanner inputDbl = new Scanner(System.in);


    void prompt() throws Exception {
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("How much do you want to deposit");
        balance = inputDbl.nextDouble();
    }

    void menu() throws Exception{
        while (true) {
            System.out.println("Check balance, Withdraw funds, Cancel");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("Check balance")) {
                //checkBalance (); check balance
                System.out.println("Your balacne is " + balance);

            } else if (choice.equalsIgnoreCase("Withdraw funds")) {
                //withdraw funds here
                withdraw();

                System.out.println("This is withdraw funds");
            } else if (choice.equalsIgnoreCase("Cancel")) {
                //withdraw funds here
                System.out.println("Thank you have a nice day!");
                System.exit(0);

            } else
                return;

        }
    }

    public void withdraw() throws Exception{

        System.out.println("how much would you like?");
        double withdraw = inputDbl.nextDouble();
        if (withdraw> balance) {
            throw new Exception("Wrong");
        } else {
          balance = balance - withdraw;
          System.out.println("Please take your money. Your new balance is" + balance );
        }

    }
}









