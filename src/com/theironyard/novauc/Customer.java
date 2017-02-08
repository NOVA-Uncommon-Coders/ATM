package com.theironyard.novauc;
import java.util.Scanner;
/**
 * Created by christinekoufos old on 2/8/17.
 */
public class Customer {


    public static void main(String[] args) {

        int balance = 500;

        System.out.println("What is Your Name?");

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
        System.out.println("Welcome, "+name);

        System.out.println("Check my balance, cancel, withdraw funds");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("check my balance")) {
            System.out.println("your balance is" +  balance);
        } else if (response.equalsIgnoreCase("cancel")) {
            System.out.println("cancel works");
        }
        else ()
//        System.out.println("Cancel?");
//        String cancel = scanner.nextLine();
//
//        System.out.println("Check your Balance?");
//        String Balance = scanner.nextLine();






}}



