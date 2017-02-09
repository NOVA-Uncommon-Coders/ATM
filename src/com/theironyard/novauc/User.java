package com.theironyard.novauc;

import static com.theironyard.novauc.ATM.user;

/**
 * Created by octavio on 2/8/17.
 */
public class User {

    String name;
    String option;
    int money;
    int balance;
    int newbalance;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Invalid entry, please type your name!");
            throw new Exception("Please type again!");
        } else {
            System.out.println("Welcome, " + name);
        }
    }

    public void chooseOption() throws Exception {
        System.out.println("What would you like to do today? Check my balance / Withdraw Funds / Cancel");
        option = ATM.scanner.nextLine();

        if (option.equalsIgnoreCase("Check my balance")) {
            System.out.println("Your balance is: " + money);
        } else if (option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again...Good Bye");
        } else if (option.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("How much money to withdraw?");
            balance = ATM.scanner.nextInt();

            if (balance > money) {
                throw new Exception("Not enough funds available");
            } else {
                System.out.println("Please take your money");
                money = (money - balance);
                System.out.println("Your new balance is ... " + money);
            }
        }
        if (balance < money) {
            System.out.println("What would you like to do today? Check my balance / Withdraw Funds / Cancel");
            option = ATM.scanner.nextLine();
        }

    }
}










