package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/8/17.
 */
public class Customer {

    String name;
    String balance;


    int choice;


    int withdraw;
    int cancel;





    public void chooseName() throws Exception {
//        if (favoriteNumber == 7) {
//            System.out.println("That's a bad favorite number");
//        } else {
//            System.out.println("Cool, your favorite number is " + favoriteNumber);
//        }


        System.out.println("What is your name!");
        name = ATM.scanner.nextLine();


        if (name.equalsIgnoreCase("")) {
            throw new Exception("Invalid name.");

        } else {
            System.out.println("Welcome, " + name);


        }
    }
        public void chooseBalance() throws Exception {
        System.out.println("Would you like to 1. balance 2. withdraw 3. cancel ");
        String balance = ATM.scanner.nextLine();
        if (balance.equalsIgnoreCase("1")) {
            System.out.println("1000");
        }
        else if (balance.equalsIgnoreCase("2")) {
            System.out.println("How much would you like");


        }
        else if (balance.equalsIgnoreCase("3")) {
            System.out.println("Thank you and please come again");
        }

    }
}