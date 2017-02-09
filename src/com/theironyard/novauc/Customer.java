package com.theironyard.novauc;

/**
 * Created by Merlin on 2/8/17.
 */
public class Customer {
    String Pin_Number;
    String option;
    int  response;
    int attempted_withdrawal;
    int balance;
    int leftover_funds;
    public Customer(){
        balance = 800;
    }
    public Customer(int balance){
        this.balance = balance;
    }

    public void choosepin_number() {
        System.out.println("What is your Pin Number?");
        Pin_Number = ATM.scanner.nextLine();
        System.out.println("Welcome, what would you like to do? Customer Pin Number: " + Pin_Number);

    }

    public void chooseOption() throws Exception {
        System.out.println("Check my balance, Withdraw Funds or Cancel (Be sure to spell correctly)");
        option = ATM.scanner.nextLine();

        if (option.equalsIgnoreCase("Check my balance")){
            System.out.println("I would be happy to help you with that");
            System.out.println("Your current balance is $" +balance);

        }  else if (option.equalsIgnoreCase("Withdraw funds")) {
            System.out.println("I would be happy to help you with that");
        }  else if (option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again.");
            System.exit(0);
        }
        else {
            throw new Exception("Invalid Response");
        }
    }

    public void chooseResponse() throws Exception {
        System.out.println("How much money would you like to withdraw? (Example: 5, 10, 20, etc.) Do not use $ symbol.");
        response = ATM.scanner.nextInt();

     if (response <= balance) {
         balance = balance - response;
        System.out.println("Please take your money below");
        System.out.println("Your balance is now: $" +balance);
        System.out.println("Have a great day");
        }
        else {
            throw new Exception("You do not have enough money in your account to withdraw this much");
        }


    }



}