package com.theironyard.novauc;


import java.util.Scanner;

/**
 * Created by ANVIL_OCTOPUS on 2/8/17.
 */
public class Customer {
    Scanner input = new Scanner(System.in);


    void prompt () throws Exception {
        System.out.println("What is your name?");
        input.nextLine();
    }

    void menu () {
        while (true){
            System.out.println("Check balance, Withdraw funds, Cancel");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("Check balance")) {
                //checkBalance (); check balance
                System.out.println("This is check balance");

            }

            else if  (choice.equalsIgnoreCase("Withdraw funds")) {
                //withdraw funds here
                System.out.println("This is withdraw funds");
            }
            else
                return;

        }
    }




}