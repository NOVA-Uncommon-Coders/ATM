package com.theironyard.novauc;


import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int withdraw = 100-50;
        double take = 50;


        System.out.println("Hello, how are you? Please enter your name.");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            throw new Exception("Ask for name");
        }
            System.out.println("Please select following options. 1.balance 2.Withdrawl funds 3 cancel");
            String options = scanner.nextLine();

        switch (options){
            case "1":
             System.out.println("Your balance " + balance);
             break;
            case  "2":
             System.out.println(("How much would you like to withdraw?"));
           String money = scanner.nextLine();
             int withdrawl = Integer.valueOf(money);
             if(withdrawl > balance){
                 throw new Exception("Insufficent Funds");
             } else{
                 System.out.println("Thank you, please take your money ");
             }

             System.out.println("Withdraw money " + withdraw);
              System.out.println("Your new balance is " + take );
              break;
            case  "3":
                System.out.println("Thank you please come again.");
                System.exit(0);






        }





    }



        }






























//




