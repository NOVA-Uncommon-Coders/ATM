package com.theironyard.novauc;
import java.util.Scanner;
/**
 * Created by christinekoufos old on 2/8/17.
 */
public class Customer {


    public static void main(String[] args) throws Exception{


        int balance = 500;

        System.out.println("What is Your Name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Check my balance, cancel, withdraw funds");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("check my balance")) {
            System.out.println("your balance is" + balance);
        } else if (response.equalsIgnoreCase("cancel")) {
            System.out.println("Thank you and please come again.");

        } else if (response.equalsIgnoreCase("withdraw funds")) {
            System.out.println("how much would you like to withdraw?");
            String withdraw = scanner.nextLine();
            int withdrawAmount = Integer.valueOf(withdraw);

            if (balance <withdrawAmount)
            {
                throw new Exception("Request is greater than balance");

            }
            else {
                System.out.println("Take your cash");
                balance = balance -withdrawAmount ;
                System.out.println(balance);
            }

            }
            }










}
    // System.out.println("Cancel?");String cancel = scanner.nextLine();

      // System.out.println("Check your Balance?");
      // String Balance = scanner.nextLine();










