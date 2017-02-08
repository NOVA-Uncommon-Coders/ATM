package com.theironyard.novauc;

/**
 * Created by souporman on 2/8/17.
 */
public class Account {


    String name;

    public void AccountName() throws Exception {


        System.out.print("Please enter your name: ");
        name = Main.kb.nextLine();

        if(name.equalsIgnoreCase("")||name==null||name.isEmpty()) {
            throw new Exception("You have entered an invalid name");
        }
        else {
            System.out.println("\n##################################################");
            System.out.println();
            System.out.println("\t\tWelcome, " + name);
            System.out.println();

        }
        Main.program.setBalance();
        Main.program.Program();
    }
}
