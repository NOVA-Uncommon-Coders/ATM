package com.theironyard.novauc;

/**
 * Created by Eric on 2/8/17.
 */
public class Person {
    String name;
    int query;
    int balance;
    int subFunds;
    int addFunds;

    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        if (name.equals("")) {
            System.out.println("Your account has been hacked.");
        }
        else {
            System.out.println("Welcome to the Uncommon Coders ATM, " + name + ".");
        }
    }

    public Person(int balance, int subFunds, int addFunds) {
        this.balance = balance;
        this.subFunds = subFunds;
    }

    public void chooseQuery() throws Exception {
        System.out.println("Press 1 to check your balance. " + " Press 2 to withdraw funds. " + " Press 3 to cancel.");
        query = ATM.scanner.nextInt();

        if (query == 1) {
            System.out.println("Your current balance is " + balance);
        } else if (query == 2) {
            System.out.println("Please Enter the amount of funds you would like to withdraw: ");
            subFunds = ATM.scanner.nextInt();
            if (subFunds > balance) {
                System.out.println("Withdrawal amount exceeds balance.");
            } else {
                balance = balance - subFunds;
                System.out.println("Please take your money.");
                System.out.println("Your Balance is now " + balance + ".");
            }

        } else {
            System.out.println("Thank you and please come again.");
        }

        System.out.println("Press 1 to deposit funds. " + " Press 2 to withdraw funds. " + " Press 3 to cancel.");
        query = ATM.scanner.nextInt();

        if (query == 1) {
            System.out.println("How much would you like to deposit? ");
            addFunds = ATM.scanner.nextInt();
                balance = balance + addFunds;
                System.out.println("Please take your money.");
                System.out.println("Your Balance is now " + balance +".");

        } else if (query == 2) {
            System.out.println("Please Enter the amount of funds you would like to withdraw: ");
            subFunds = ATM.scanner.nextInt();
            if (subFunds > balance) {
                System.out.println("Withdrawal amount exceeds balance.");
            } else {
                balance = balance - subFunds;
                System.out.println("Please take your money.");
                System.out.println("Your Balance is now " + balance + ".");
            }

        } else {
            System.out.println("Thank you and please come again.");
        }
    }


    public void setBalance() {

    }

}


