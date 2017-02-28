package com.theironyard.novauc;

import java.util.Scanner;

public class ATM{

    public static void main (String[] args) throws Exception {
        // write your code here

        User customer = new User(0, 75, 25);

        System.out.println("Welcome to Bank of America; we are going to screw you and your funds!");
        System.out.println("What is your name?");


        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" 1 0 0 %   R 0 B B E D - F R E E !    |¯¯¯|\n" +
                "               ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    |   |\n" +
                "         .´¯¯¯¯¯¯¯||¯¯¯¯¯¯¯`..´¯¯¯¯¯¯`.|¯¯¯`¯¯¯`..´¯¯¯    |\n" +
                "         |   ..   ||   ||   ||___'|   ||   ||   ||   ||   |\n" +
                "         |   ||   ||       < .————'   ||   ||   ||   ||   |\n" +
                "         |   ||   ||   ..   ||   ..   ||   ||   ||   ||   |\n" +
                "         |   ''   ||   ||   ||   ''   ||   ||   ||        |\n" +
                "         `.___    ||   ||   |`._______||___||___|`._______|\n" +
                "         .————'   ||___||   '————.\n" +
                "         |_______.´|   |`.___    |                           ___\n" +
                "                 .-'   '————.|   '———.  .——————. .————————..'   '————.\n" +
                "                 |_     ____||        ||        ||    ____||     ____|\n" +
                "                   |   |.———.|   ||   ||   ||   ||   '————. |   |.———.\n" +
                "                   |   ||   ||   ||   ||    ____||    ____| |   ||   |\n" +
                "                   |   ||   ||   ||   ||   |.———.|   |      |   ||   |\n" +
                "                   |        ||   ||   ||        ||   |      |        |\n" +
                "                   `.______.´|___||___|`.______.´|___|      `.______.´\n" +
                "         .´¯¯¯¯¯¯`.|¯¯¯||¯¯¯|-¯¯¯'————..´¯¯¯¯¯¯|¯¯¯¯¯¯¯¯|     |¯¯¯¯¯¯|\n" +
                "         |___'|   ||   ||   ||    ____||   ..   ¯\\    ´¯       ¯`  /¯\n" +
                "         .————'   ||   ||   ||   |.———.|   ||   | \\    \\        / /\n" +
                "         |   ..   ||   ||   ||   ||   ||   ||   |  \\    \\      / /\n" +
                "         |   ''   ||   ''   ||   ''   ||   ''   |   \\    \\    / /\n" +
                "         `._______|`.______.´`.______.´`.______.´    \\    \\  / /\n" +
                "                                                      \\    \\/ /\n" +
                "           Bank of America support                     \\     /\n" +
                "                                                        \\   /\n" +
                "                      " +
                "" +

                "Get your lube ready, " + name + " HAHAHAHA!");
        System.out.println("Enter your damn pin! [pin/leave]");
        String pin = scanner.nextLine();


        if (pin.equalsIgnoreCase("1234")) {
            System.out.println("Here are your insufficient funds...do better.");

        } else if (pin.equalsIgnoreCase("leave")) {
            System.out.println("Bye Felicia!");

        } else {
            throw new Exception("Stand there in the cold then, dummy.");
        }



            System.out.println("Check your [balance]");
            String  j = scanner.nextLine();


            if (j.equalsIgnoreCase("balance"))
            {System.out.print(" Your balance is" + customer.balance);
            }


            System.out.println("Check your [Checking/Savings/Deposit/Withdraw/Cancel]");
            String prompt = scanner.nextLine();

            if (prompt.equalsIgnoreCase("Checking")) {
                System.out.println("Your checking is "+customer.checking);
            } else if (prompt.equalsIgnoreCase("Savings")) {
                System.out.println("Your savings balance is " + customer.savings);
            }
            else if (prompt.equalsIgnoreCase("Deposit")) {
                System.out.println("Your balance is" + customer.balance);
            }


            else if (prompt.equalsIgnoreCase("Withdraw")) {
                System.out.println(+customer.balance - customer.savings);
            }


            else if (prompt.equalsIgnoreCase("Cancel")) {

                    System.out.println("You broke anyway");
                }

            else {
                    throw new Exception("You just gonna stare at the machine?");
                }
              System.out.println("Have an unpleasant day!");
            }
        }










