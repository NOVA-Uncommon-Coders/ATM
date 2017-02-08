package com.theironyard.novauc;

/**
 * Created by souporman on 2/8/17.
 */
public class ATMProgram {
    int option;
    double balance, withdraw;
    double quarters, dimes, nickles, pennies, remainder;
    int squarters, sdimes, snickles, spennies;

    public void setBalance() {
        balance = (int) (Math.random() * 5000);
    }

    public void setChange() {
        quarters = (withdraw / .25);
        remainder = (withdraw % .25);
        dimes = (remainder / .10);
        remainder = (remainder % .10);
        nickles = (remainder / .05);
        remainder = (remainder % .05);
        pennies = (remainder / .01);

        squarters = (int) quarters;
        sdimes = (int) dimes;
        snickles = (int) nickles;
        spennies = (int) pennies;
    }

    public void checkBalance() throws Exception {
        System.out.println("#################  BALANCE MENU #################");
        System.out.println();
        System.out.println("Your current Balance is    " + balance);
        System.out.println();
        System.out.println("would you like to return to the main menu: Y/N ");
        Main.kb.nextLine();
        String options = Main.kb.nextLine();

        if (options.equalsIgnoreCase("y")) {
            Program();
        }
        else if (options.equalsIgnoreCase("n")) {
            cancel();
        }
        else
            throw new Exception("you have chosen an invalid option");
    }



    public void withdrawFunds()throws Exception{
        System.out.println("################  WITHDRAW MENU #################");
        System.out.println();
        System.out.println("PLEASE ENTER THE AMOUNT YOU WISH TO WITHDRAW");
        withdraw=Main.kb.nextDouble();

        if (withdraw>balance){
            throw new Exception("You have entered a larger amount than what is available");
        }
        else {
            System.out.println("CURRENT BALANCE:    " + balance);
            System.out.println("\tMINUS");
            System.out.println("WITHDRAWN AMOUNT:   " + withdraw);
            System.out.println("WOULD YOU LIKE TO CONTINUE WITH THE WITHDRAW: Y/N");
            System.out.println();
            Main.kb.nextLine();
            String response = Main.kb.nextLine();
            if (response.equalsIgnoreCase("n")) {
                Program();
            }
            else if (response.equalsIgnoreCase("y")){
                setChange();
                System.out.println("YOU WILL BE RECEIVING");
                System.out.println(squarters+" QUARTERS "+sdimes+" DIMES "+snickles+" NICKLES "+spennies+" PENNIES ");
                System.out.println("TRANSACTION HAS BEEN COMPLETED PLEASE TAKE YOUR MONEY");
                balance = balance - withdraw;
                System.out.println();
                System.out.println("#################################################");
                System.out.println();
                System.out.println("CURRENT AMOUNT IN ACCOUNT IS NOW " + balance);
                System.out.println();
                System.out.println("would you like to return to the main menu: Y/N ");
                Main.kb.nextLine();
                String options = Main.kb.nextLine();

                if (options.equalsIgnoreCase("y")) {
                    Program();
                }
                else if (options.equalsIgnoreCase("n")) {
                    cancel();
                }
                else
                    throw new Exception("you have chosen an invalid option");

            }
        }
    }
    public void cancel(){
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println();
        System.out.println("Thank you and please come again");
        System.out.println();
        System.out.println("#################################################");
        System.out.println("#################################################");
    }

    public void Program()throws Exception{
        System.out.println("#################  OPTIONS MENU #################");
        System.out.println();
        System.out.println("PRESS 1 FOR : CHECK BALANCE");
        System.out.println("PRESS 2 FOR : WITHDRAW FUNDS");
        System.out.println("PRESS 3 FOR : EXIT ATM");
        System.out.println();
        System.out.println("#################################################");
        option=Main.kb.nextInt();
        if (option==1){
            checkBalance();
        }
        else if (option==2){
            withdrawFunds();
        }
        else if (option==3){
            cancel();
        }
        else
            throw new Exception("you have chosen an invalid option");
    }

}
