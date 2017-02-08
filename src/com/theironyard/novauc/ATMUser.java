package com.theironyard.novauc;


public class ATMUser {
    /********************
     * Variables
     *******************/
    private String name;
    private double balance;

    /********************
     * Constructors
     *******************/
    public ATMUser(double balance) {
        this.balance = balance;
    }

    /********************
     * Setters
     *******************/

    public void setName(String name) throws Exception {
        if (name.equalsIgnoreCase("") || name == null) {
            throw new Exception("Invalid name");
        }
        this.name = name;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /********************
     * Getters
     *******************/

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    /********************
     * Other Methods
     *******************/
    public void Greeting() throws Exception {
        starMaker(62);
        System.out.println("\n*\t\t\t\t  Welcome, ATM is now online\t\t\t\t * ");
        starMaker(62);
    }

    public void accessLoop() throws Exception {
        int loopCheck = 0;
        while (loopCheck == 0) {
            starMaker(62);
            System.out.println("\n* [Check Balance] [Withdraw] [Deposit] [Exit] [Coin Checker] *");
            starMaker(62);
            System.out.print("\n\nPlease make a choice: ");
            String choice = ATM.choiceInput.nextLine();
            switch (choice.toUpperCase()) {
                case "CHECK BALANCE":
                case "CHECKBALANCE":
                    menuDisplay("Check Balance");
                    checkBalance();
                    break;
                case "WITHDRAW":
                    menuDisplay("Withdraw");
                    withdraw();
                    System.out.println("Withdraw successful");
                    break;
                case "DEPOSIT":
                    menuDisplay("Deposit");
                    deposit();
                    break;
                case "EXIT":
                    menuDisplay("Exit");
                    System.out.println("Now Exiting....");
                    //For more functionality, add a loop break here
                    return;
                case "COIN CHECKER":
                case "COINCHECKER":
                    ATM.coinChecker();
                    break;
                default:
                    throw new Exception("Invalid choice!!!!");
            }
        }
    }
    public void deposit() throws Exception{
        System.out.print("Deposit amount: ");
        double depositAmount = ATM.input.nextDouble();
        if (depositAmount < 0) {
            throw new Exception("You must deposit a valid amount");
        } else {
            setBalance(depositAmount);
        }

    }
    public void withdraw() throws Exception{
        System.out.print("Withdraw amount: ");
        double withdrawAmount = ATM.input.nextDouble();
        if (withdrawAmount > this.balance || withdrawAmount < 0){
            throw new Exception("You must withdraw a valid amount");
        } else {
            setBalance(getBalance()-withdrawAmount);
        }
    }
    public void checkBalance() throws Exception{
        System.out.println("Check Balance");
        System.out.println("Your balance is: " + balance);
    }
    public void starMaker(int amount){
        for (int i = 0; i < amount; i++){
            System.out.print("*");
        }
    }
    public void menuDisplay(String area) {
        starMaker(62);
        System.out.println("\n*\t\t user: " + getName() + "\t\t area: " + area + "\t\t*");
        starMaker( 62);
        System.out.println("");
        System.out.println("");
    }
    public void login() throws Exception{
        System.out.print("\nPlease login: ");
        setName(ATM.input.nextLine());
    }

}
